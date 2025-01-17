package xiang_134;

import java.util.Arrays;

/*
 * 可以擴容的heap,max 用於指定是大頂堆還是小頂堆
 */
public class Heap {
	int[] array;
	int size;
	boolean max;

	public int getSize() {
		return size;
	}

	public Heap(int capacity, boolean max) {
		this.array = new int[capacity];
		this.max = max;
	}

	public void replace(int replaced) {
		array[0] = replaced;
		down(0);
	}

	public void offer(int offered) {
		if (size == array.length) {
			// 擴容
			grow();
		}
		up(offered);
		size++;
	}

	private void grow() {
		int capacity = size + (size >> 1);
		capacity += capacity >> 1;
		int[] newArray = new int[capacity];
		System.arraycopy(array, 0, newArray, 0, size);
		array = newArray;
	}

	// 刪除堆頂元素 Returns:堆頂元素
	public int poll() {
		int top = array[0];
		swap(0, size - 1);
		size--;
		down(0);
		return top;
	}

	// 獲取堆頂元素 Params:堆頂元素
	public int peek() {
		return array[0];
	}

	// 將offered 元素上浮:直至offered 小於父元素或到堆影
	private void up(int offered) {
		int child = size;
		while (child > 0) {
			int parent = (child - 1) / 2; // 公式
			boolean cmp = max ? offered > array[parent] : offered < array[parent];
			if (cmp) {
				array[child] = array[parent];
			} else {
				break;
			}
			child = parent;
		}
		array[child] = offered;
	}

	// 建堆
	private void heapify() {
		// 如何找到最後非葉子結點 size >>>1-1
		for (int i = size / 2 - 1; i >= 0; i--) {
			down(i);
		}
	}

	// 將parent 索引處的元素下潛,與兩個孩子較大者交換,直至沒孩子或孩子沒他大
	private void down(int parent) {
		int left = parent * 2 + 1;
		int right = left + 1;
		int maxOrmin = parent;
		if (left < size && (max ? array[left] > array[maxOrmin] : array[left] < array[maxOrmin])) {
			maxOrmin = left;
		}
		if (right < size && (max ? array[right] > array[maxOrmin] : array[right] < array[maxOrmin])) {
			maxOrmin = right;
		}

		if (maxOrmin != parent) { // 找到更大的孩子
			swap(maxOrmin, parent);
			down(maxOrmin);
		}

	}

	private void swap(int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	public static void main(String[] args) {
		Heap left = new Heap(5, true);
		for (int i = 1; i <= 10; i++) {
			left.offer(i);
			System.out.println(Arrays.toString(left.array));
		}
	}
}
