package xiang_132;

import java.util.Iterator;

import xiang_129.Queue;

/*
 * 基於無序數組實現
 * Type parameters:<E> 隊列中元素類型,必須實現Priority
 */
public class PriorityQueue1<E extends Priority> implements Queue<E>, Iterable<E> {
	Priority[] array;
	int size;

	public PriorityQueue1(int capacity) {
		array = new Priority[capacity];
	}

	@Override
	public boolean offer(E e) {
		if (isFull()) {
			return false;
		}
		array[size++] = e;
		return true;
	}

	// 返回優先級最高的索引值
	private int selectMax() {
		int max = 0;
		for (int i = 1; i < size; i++) {
			if (array[i].priority() > array[max].priority()) {
				max = i;
			}
		}
		return max;
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		int max = selectMax();
		E e = (E) array[max];
		remove(max);
		return e;
	}

	private void remove(int index) {
		if (index < size - 1) {
			// 移動
			System.arraycopy(array, index + 1, array, index, size - 1 - index);
		}
		array[--size] = null; // help gc
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		int max = selectMax();
		return (E) array[max];
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

}
