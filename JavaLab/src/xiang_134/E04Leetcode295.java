package xiang_134;

import java.util.Arrays;

/*
 * 數據流的中位數
 */
public class E04Leetcode295 {
	/*
	 * 為了保證兩邊數據量的平衡 兩邊個數一樣時,左邊個數+1 兩邊個數不一樣時,右邊個數+1
	 * 
	 * 但是,隨便一個數能直接加入嗎? 左邊個數加1時,應該挑右邊最小的加入 右邊個數加1時,應該挑左邊最大的加入
	 */

	public void addNum(int num) {
		if (left.getSize() == right.getSize()) {
			right.offer(num);
			left.offer(right.poll());
		} else {
			left.offer(num);
			right.offer(left.poll());
		}
	}

	/*
	 * 兩邊數據一致,左右各取堆頂元素平均 左邊多一個,取左邊堆頂元素
	 */
	public double findMedian() {
		if (left.getSize() == right.getSize()) {
			return (left.peek() + right.peek()) / 2.0;
		} else {
			return left.peek();
		}
	}

	private Heap left = new Heap(10, true);
	private Heap right = new Heap(10, false);

	@Override
	public String toString() {
		int size = left.size;
		int[] left = new int[size];
		for (int i = 0; i < left.length; i++) {
			left[size - 1 - i] = this.left.array[i];
		}
		int[] right = Arrays.copyOf(this.right.array, this.right.size);
		return Arrays.toString(left) + "<->" + Arrays.toString(right);
	}

	public static void main(String[] args) {
		E04Leetcode295 test = new E04Leetcode295();
		test.addNum(1);
		test.addNum(2);
		test.addNum(3);
		test.addNum(7);
		test.addNum(8);
		test.addNum(9);
		System.out.println(test);
		System.out.println(test.findMedian());
		test.addNum(10);
		System.out.println(test);
		System.out.println(test.findMedian());

		test.addNum(4);
		System.out.println(test);
		System.out.println(test.findMedian());

	}
}
