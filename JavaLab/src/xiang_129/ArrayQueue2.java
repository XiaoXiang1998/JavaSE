package xiang_129;

import java.util.Iterator;

public class ArrayQueue2<E> implements Queue<E>, Iterable<E> {

	private E[] array;
	private int head = 0;
	private int tail = 0;
	private int size = 0; // 元素個數

	@SuppressWarnings("all")
	public ArrayQueue2(int capacity) {
		array = (E[]) new Object[capacity];
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int p = head;
			int count = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return count < size;
			}

			@Override
			public E next() {
				E value = array[p];
				p = (p + 1) % array.length;
				count++;
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
		size++;
		return true;
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		E value = array[head];
		head = (head + 1) % array.length;
		size--;
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
		return size == 0;
	}

	@Override
	public boolean isFull() {

		return size == array.length;
	}

	public static void main(String[] args) {
		ArrayQueue2<String> queue = new ArrayQueue2<String>(4);
		queue.offer("a");
		queue.poll();
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		for (String string : queue) {
			System.out.println(string);
		}
	}
}
