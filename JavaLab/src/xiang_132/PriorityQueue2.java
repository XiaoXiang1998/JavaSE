package xiang_132;

import java.util.Iterator;

import xiang_129.Queue;

/*
 * 基於有序數組實現
 * Type parameters:<E> 隊列中元素類型,必須實現Priority
 */
public class PriorityQueue2<E extends Priority> implements Queue<E>, Iterable<E> {
	Priority[] array;
	int size;

	public PriorityQueue2(int capacity) {
		array = new Priority[capacity];
	}

	@Override
	public boolean offer(E e) {
		if (isFull()) {
			return false;
		}
		insert(e);
		size++;
		return true;
	}

	private void insert(E e) {
		int i = size - 1;
		while (i >= 0 && array[i].priority() > e.priority()) {
			array[i + 1] = array[i];
			i--;
		}
		array[i + 1] = e;
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		E e = (E) array[size - 1];
		array[--size] = null; // help gc
		return e;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return (E) array[size - 1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size == array.length;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int p = 0;

			@Override
			public boolean hasNext() {
				return p < size;
			}

			@Override
			public E next() {
				Priority value = array[p++];
				return (E) value;
			}
		};
	}

	public static void main(String[] args) {
		PriorityQueue2<Entry> queue = new PriorityQueue2<Entry>(5);
		queue.offer(new Entry("taks1", 4));
		queue.offer(new Entry("taks2", 3));
		queue.offer(new Entry("taks3", 2));
		queue.offer(new Entry("taks4", 5));
		queue.offer(new Entry("taks5", 10));
		for (Entry entry : queue) {
			System.out.println(entry);
		}
		System.out.println("-------------");
		Entry peek = queue.peek();
		System.out.println("優先級最高:" + peek);
		queue.poll().priority();
		queue.poll().priority();
		for (Entry entry : queue) {
			System.out.println(entry);
		}
	}
}
