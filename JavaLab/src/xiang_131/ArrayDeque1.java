package xiang_131;

import java.util.Iterator;

/*
 * 基於循環數組,特點
 * tail停下來的位置不存儲,會浪費一個位置
 * Type parameters: <E> 隊列中元素類型
 */
public class ArrayDeque1<E> implements Dequq<E>, Iterable<E> {

	static int inc(int i, int length) {
		if (i + 1 >= length) {
			return 0;
		}
		return i + 1;
	}

	static int dec(int i, int length) {
		if (i - 1 < 0) {
			return length - 1;
		}
		return i - 1;
	}

	E[] array;
	int head;
	int tail;

	@SuppressWarnings("all")
	public ArrayDeque1(int capacity) {
		array = (E[]) new Object[capacity + 1];
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int p = head;

			@Override
			public boolean hasNext() {
				return p != tail;
			}

			@Override
			public E next() {
				E e = array[p];
				p = inc(p, array.length);
				return e;
			}
		};
	}

	@Override
	public boolean offerFirst(E e) {
		if (isFull()) {
			return false;
		}
		head = dec(head, array.length);
		array[head] = e;
		return true;
	}

	@Override
	public boolean offerLast(E e) {
		if (isFull()) {
			return false;
		}
		array[tail] = e;
		tail = inc(tail, array.length);
		return true;
	}

	@Override
	public E pollFirst() {
		if (isEmpty()) {
			return null;
		}
		E e = array[head];
		array[head] = null; // help gc
		head = inc(head, array.length);
		return e;
	}

	@Override
	public E pollLast() {
		if (isEmpty()) {
			return null;
		}
		tail = dec(tail, array.length);
		E e = array[tail];
		array[tail] = null;
		return e;
	}

	@Override
	public E peekFirst() {
		if (isEmpty()) {
			return null;
		}
		return array[head];
	}

	@Override
	public E peekLast() {
		if (isEmpty()) {
			return null;
		}
		return array[dec(tail, array.length)];
	}

	@Override
	public boolean isEmpty() {
		return head == tail;
	}

	@Override
	public boolean isFull() {
		if (tail > head) {
			return tail - head == array.length - 1;
		} else if (tail < head) {
			return head - tail == 1;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		ArrayDeque1<Integer> deque = new ArrayDeque1<Integer>(3);
		deque.offerFirst(1);
		deque.offerFirst(2);
		deque.pollLast();
		deque.offerLast(3);
		deque.offerFirst(4);
		for (Integer integer : deque) {
			System.out.println(integer);
		}
	}

}
