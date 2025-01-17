package xiang_132;

import java.util.Iterator;

import xiang_129.Queue;

/*
 * 大頂堆
 * 
 */
public class PriorityQueue4<E extends Priority> implements Queue<E>, Iterable<E> {
	Priority[] array;
	int size;

	public PriorityQueue4(int capacity) {
		array = new Priority[capacity];
	}

	/*
	 * 入堆新元素,加入到數組末尾(索引位置child) 不斷比較新元素與它的父節點(parent)優先級
	 * -如果父節點優先級低,則向下移動,並找到下一個parent 值至父節點優先級更高或child==0為止
	 */
	@Override
	public boolean offer(E offered) {
		if (isFull()) {
			return false;
		}
		int child = size++;
		int parent = (child - 1) / 2;
		while (child > 0 && offered.priority() > array[parent].priority()) {
			array[child] = array[parent];
			child = parent;
			parent = (child - 1) / 2;
		}
		array[child] = offered;
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

	/*
	 * 交換堆頂和尾部元素,讓尾部元素出隊 (下潛) 從堆頂開始,將父元素與兩個孩子較大者交換 直到父元素大於兩個孩子 ,或沒有孩子為止
	 */
	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		swap(0, size - 1);
		size--;
		Priority e = array[size];
		array[size] = null;
		// 下潛
		down(0);
		return (E) e;
	}

	private void down(int parent) {
		int left = 2 * parent + 1;
		int right = left + 1;
		int max = parent; // 假設父元素優先級最大
		if (left < size && array[left].priority() > array[max].priority()) {
			max = left;
		}
		if (right < size && array[right].priority() > array[max].priority()) {
			max = right;
		}
		if (max != parent) { // 有孩子比父親大
			swap(max, parent);
			down(max);
		}
	}

	private void swap(int i, int j) {
		Priority t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return (E) array[0];
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
		PriorityQueue4<Entry> queue = new PriorityQueue4<Entry>(5);
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
