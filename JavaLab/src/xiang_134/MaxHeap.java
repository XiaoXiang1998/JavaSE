package xiang_134;

import java.util.Arrays;

/* 建堆
 * 大頂堆
 */
public class MaxHeap {
	int[] array;
	int size;

	public MaxHeap(int capacity) {
		this.array = new int[capacity];
	}

	// 獲取堆頂元素 Params:堆頂元素
	public int peek() {
		return array[0];
	}

	// 刪除堆頂元素 Returns:堆頂元素
	public int poll() {
		int top = array[0];
		swap(0, size - 1);
		size--;
		down(0);
		return top;
	}

	// 刪除指定索引處元素 Params:index-索引 Returns:被刪除元素
	public int poll(int index) {
		int deleted = array[index];
		swap(index, size - 1);
		size--;
		down(index);
		return deleted;
	}

	// 替換堆頂元素 Params:replaced-新元素
	public void replace(int replaced) {
		array[0] = replaced;
		down(0);
	}

	// 堆的尾部添加元素 Params:offered -被添加元素值 Returns:是否添加成功

	public boolean offer(int offered) {
		if (size == array.length) {
			return false;
		}
		up(offered);
		size++;
		return true;
	}

	// 將inserted 元素上浮:直至offered 小於父元素或到堆影
	private void up(int offered) {
		int child = size;
		while (child > 0) {
			int parent = (child - 1) / 2; // 公式
			if (offered > array[parent]) {
				array[child] = array[parent];
			} else {
				break;
			}
			child = parent;
		}
		array[child] = offered;
	}

	public MaxHeap(int[] array) {
		this.array = array;
		this.size = array.length;
		heapify();
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
		int max = parent;
		if (left < size && array[left] > array[max]) {
			max = left;
		}
		if (right < size && array[right] > array[max]) {
			max = right;
		}

		if (max != parent) { // 找到更大的孩子
			swap(max, parent);
			down(max);
		}

	}

	private void swap(int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	public static void main(String[] args) {
//		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array = { 2, 3, 1, 7, 6, 4, 5 };
		MaxHeap maxHeap = new MaxHeap(array);
		System.out.println(Arrays.toString(maxHeap.array));

		while (maxHeap.size > 1) {
			maxHeap.swap(0, maxHeap.size - 1);
			maxHeap.size--;
			maxHeap.down(0);
		}
		System.out.println(Arrays.toString(maxHeap.array));

	}
}
