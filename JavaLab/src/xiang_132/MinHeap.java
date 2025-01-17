package xiang_132;

import xiang_127.ListNode;

//小頂堆
public class MinHeap {
	ListNode[] array;
	int size;

	public MinHeap(int capacity) {
		array = new ListNode[capacity];
	}

	public boolean offer(ListNode offered) {
		if (isFull()) {
			return false;
		}
		int child = size++;
		int parent = (child - 1) / 2;
		while (child > 0 && offered.val < array[parent].val) {
			array[child] = array[parent];
			child = parent;
			parent = (child - 1) / 2;
		}
		array[child] = offered;
		return true;
	}

	public ListNode poll() {
		if (isEmpty()) {
			return null;
		}
		swap(0, size - 1);
		size--;
		ListNode e = array[size];
		array[size] = null;
		// 下潛
		down(0);
		return e;
	}

	private void down(int parent) {
		int left = 2 * parent + 1;
		int right = left + 1;
		int max = parent; // 假設父元素優先級最小
		if (left < size && array[left].val < array[max].val) {
			max = left;
		}
		if (right < size && array[right].val < array[max].val) {
			max = right;
		}
		if (max != parent) { // 有孩子比父親小
			swap(max, parent);
			down(max);
		}
	}

	private void swap(int i, int j) {
		ListNode t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == array.length;
	}
}
