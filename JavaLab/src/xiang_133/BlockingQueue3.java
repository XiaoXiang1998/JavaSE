package xiang_133;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 單鎖實現
 * Type parameters:<E> -元素類型
 */
public class BlockingQueue3<E> implements BlockingQueue<E> {

	private final E[] array;
	private int head;
	private int tail;
	private AtomicInteger size = new AtomicInteger();

	public BlockingQueue3(int capacity) {
		array = (E[]) new Object[capacity];
	}

	private ReentrantLock tailLock = new ReentrantLock();
	private Condition tailWaits = tailLock.newCondition();
	private ReentrantLock headLock = new ReentrantLock();
	private Condition headWaits = headLock.newCondition();

	private boolean isEmpty() {
		return size.get() == 0;
	}

	private boolean isFull() {
		return size.get() == array.length;
	}

	@Override
	public void offer(E e) throws InterruptedException { // poll等待隊列非空
		tailLock.lockInterruptibly();
		int c; // 添加前元素個素
		try {
			while (isFull()) {
				tailWaits.await();
			}
			array[tail] = e;
			if (++tail == array.length) {
				tail = 0;
			}
			c = size.getAndIncrement(); // size ++
			if (c + 1 < array.length) {
				tailWaits.signal();
			}
		} finally {
			tailLock.unlock();
		}

		// 喚醒等待非空的poll線程
		if (c == 0) {
			headLock.lock();
			try {
				headWaits.signal();
			} finally {
				headLock.unlock();
			}
		}
	}

	@Override
	public boolean offer(E e, long timeout) throws InterruptedException { // 毫秒
		tailLock.lockInterruptibly();
		try {
			long t = TimeUnit.MILLISECONDS.toNanos(timeout); // 返回值代表剩餘時間
			while (isFull()) {
				if (t <= 0) {
					return false;
				}
				t = tailWaits.awaitNanos(t); // 最多等待多少納秒
			}
			array[tail] = e;
			if (++tail == array.length) {
				tail = 0;
			}
			size.getAndIncrement();

		} finally {
			tailLock.unlock();
		}

		headLock.lock();
		try {
			headWaits.signal();
		} finally {
			headLock.unlock();
		}
		return true;
	}

	@Override
	public E poll() throws InterruptedException {
		E e;
		int c; // 取走前元素個數
		headLock.lockInterruptibly();
		try {
			while (isEmpty()) {
				headWaits.await();
			}
			e = array[head];
			array[head] = null; // help gc
			if (++head == array.length) {
				head = 0;
			}
			c = size.getAndDecrement(); // size --
			if (c > 1) {
				headWaits.signal();
			}
		} finally {
			headLock.unlock();
		}

		// 對列從滿->不滿時 由poll線程喚醒等待的offer線程
		if (c == array.length) {
			tailLock.lock();
			try {
				tailWaits.signal();
			} finally {
				tailLock.unlock();
			}
		}
		return e;

	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue3<String> queue = new BlockingQueue3<String>(3);

		/*
		 * queue.offer("任務1");
		 * 
		 * new Thread(() -> { try { queue.offer("任務2"); } catch (InterruptedException e)
		 * { throw new RuntimeException(e); } }, "offer").start();
		 * 
		 * new Thread(() -> { try { System.out.println(queue.poll()); } catch
		 * (InterruptedException e) { throw new RuntimeException(e); } },
		 * "poll").start();
		 */

		/*
		 * new Thread(() -> { try { String poll = queue.poll();
		 * System.out.println("poll_1" + poll); } catch (InterruptedException e) { throw
		 * new RuntimeException(e); } }, "poll_1").start();
		 * 
		 * new Thread(() -> { try { String poll = queue.poll();
		 * System.out.println("poll_1" + poll); } catch (InterruptedException e) { throw
		 * new RuntimeException(e); } }, "poll_2").start();
		 * 
		 * new Thread(() -> { try { queue.offer("元素"); } catch (InterruptedException e)
		 * { throw new RuntimeException(e); } }, "offer").start();
		 */
		queue.offer("元素1");
		queue.offer("元素2");
		new Thread(() -> {
			try {
				queue.offer("元素3");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}, "offer").start();

		new Thread(() -> {
			try {
				queue.poll();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}, "poll").start();

	}

}
