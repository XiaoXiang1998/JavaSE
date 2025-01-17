package xiang_133;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * synchronized 關鍵字 ,功能少
 * ReentrantLock 可重入鎖,功能多
 */
public class TestThreadUnsafe {
	private final String[] array = new String[10];
	private int tail = 0;
	private int size = 0;
	ReentrantLock lock = new ReentrantLock(); // 鎖對象
	Condition tailWaits = lock.newCondition(); // 條件變量對象 集合

	public void offer(String e) throws InterruptedException {
		// lock.lock(); // 加鎖 t1 t2
		lock.lockInterruptibly(); // 加鎖 (可以在阻塞狀態時打斷)
		try {
			while (isFull()) {
				// 滿了該做的事, offer 線程阻塞
				tailWaits.await(); // 當前線程加入 tailWaits ,並且讓此線程阻塞 tailWaits.signal() 喚醒
			}
			array[tail] = e;
			if (++tail == array.length) {
				tail = 0;
			}
			size++;
		} finally {
			lock.unlock(); // 解鎖
		}

	}

	private boolean isFull() {
		return size == array.length;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public static void main(String[] args) throws InterruptedException {
		TestThreadUnsafe queue = new TestThreadUnsafe();

		for (int i = 0; i < 10; i++) {
			queue.offer("e" + i);
		}

		new Thread(() -> {
			try {
				System.out.println(Thread.currentThread().getName() + "添加元素之前");
				queue.offer("e10");
				System.out.println(Thread.currentThread().getName() + "添加元素成功");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}, "t1").start();
		new Thread(() -> {
			System.out.println("開始喚醒");
			try {
				queue.lock.lockInterruptibly();
				queue.tailWaits.signal();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			} finally {
				queue.lock.unlock();
			}
		}, "t2").start();
	}
}
