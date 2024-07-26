package xiang_129;

import java.util.Iterator;

public class ArrayQueue1<E> implements Queue<E>, Iterable<E> {

	private E[] array;
	private int head = 0;;
	private int tail = 0;

	@SuppressWarnings("all")
	public ArrayQueue1(int capacity) {
		array = (E[]) new Object[capacity + 1];
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int p = head;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return p != tail;
			}

			@Override
			public E next() {
				E value = array[p];
				p = (p + 1) % array.length;
				return value;
			}
		};
	}

	@Override
	public boolean offer(E value) {
		if (isFull()) {
			return false;
		}
		array[tail] = value;
		tail = (tail + 1) % array.length;
		return true;
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		E value = array[head];
		head = (head + 1) % array.length;
		return value;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return array[head];
	}

	@Override
	public boolean isEmpty() {
		return head == tail;
	}

	@Override
	public boolean isFull() {

		return (tail + 1) % array.length == head;
	}

	public static void main(String[] args) {
		ArrayQueue1<Integer> queue = new ArrayQueue1<Integer>(4);
		queue.offer(1);
		queue.poll();
		queue.offer(2);
		queue.offer(1);
		queue.offer(2);
		for (Integer integer : queue) {
			System.out.println(integer);
		}
	}
}
