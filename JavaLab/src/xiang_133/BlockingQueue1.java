package xiang_133;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 單鎖實現
 * Type parameters:<E> -元素類型
 */
public class BlockingQueue1<E> implements BlockingQueue<E> {

	private final E[] array;
	private int head;
	private int tail;
	private int size;

	public BlockingQueue1(int capacity) {
		array = (E[]) new Object[capacity];
	}

	private ReentrantLock lock = new ReentrantLock();
	private Condition headWaits = lock.newCondition();
	private Condition tailWaits = lock.newCondition();

	private boolean isEmpty() {
		return size == 0;
	}

	private boolean isFull() {
		return size == array.length;
	}

	@Override
	public void offer(E e) throws InterruptedException { // poll等待隊列非空
		lock.lockInterruptibly();
		try {
			while (isFull()) {
				tailWaits.await();
			}
			array[tail] = e;
			if (++tail == array.length) {
				tail = 0;
			}
			size++;
			headWaits.signal();
		} finally {
			lock.unlock();
		}
	}

	@Override
	public boolean offer(E e, long timeout) throws InterruptedException { // 毫秒
		lock.lockInterruptibly();
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
			size++;
			headWaits.signal();
			return true;
		} finally {
			lock.unlock();
		}
	}

	@Override
	public E poll() throws InterruptedException {
		lock.lockInterruptibly();
		try {
			while (isEmpty()) {
				headWaits.await();
			}
			E e = array[head];
			array[head] = null; // help gc
			if (++head == array.length) {
				head = 0;
			}
			size--;
			tailWaits.signal();
			return e;
		} finally {
			lock.unlock();
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue1<String> queue = new BlockingQueue1<String>(3);

		/*
		 * Thread t1 = new Thread(() -> { try {
		 * System.out.println(System.currentTimeMillis() + " begin");
		 * queue.offer("任務1"); System.out.println(queue); queue.offer("任務2");
		 * System.out.println(queue); queue.offer("任務3"); System.out.println(queue);
		 * queue.offer("任務4", 5000); System.out.println(queue);
		 * System.out.println(System.currentTimeMillis() + " end"); } catch (Exception
		 * e) { throw new RuntimeException(e); } }, "生產者"); t1.start();
		 * 
		 * Thread.sleep(2000); queue.poll();
		 */

		queue.offer("任務1");

		new Thread(() -> {
			try {
				queue.offer("任務2");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}, "offer").start();

		new Thread(() -> {
			try {
				System.out.println(queue.poll());
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}, "poll").start();
	}

}
