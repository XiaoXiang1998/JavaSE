package xiang_133;

public interface BlockingQueue<E> { // 阻塞對列
	void offer(E e) throws InterruptedException;

	boolean offer(E e, long timeout) throws InterruptedException;

	E poll() throws InterruptedException;
}
