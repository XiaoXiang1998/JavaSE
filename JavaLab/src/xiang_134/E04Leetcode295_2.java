package xiang_134;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 數據流的中位數
 */
public class E04Leetcode295_2 {
	/*
	 * 為了保證兩邊數據量的平衡 兩邊個數一樣時,左邊個數+1 兩邊個數不一樣時,右邊個數+1
	 * 
	 * 但是,隨便一個數能直接加入嗎? 左邊個數加1時,應該挑右邊最小的加入 右邊個數加1時,應該挑左邊最大的加入
	 */

	public void addNum(int num) {
		if (left.size() == right.size()) {
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
		if (left.size() == right.size()) {
			return (left.peek() + right.peek()) / 2.0;
		} else {
			return left.peek();
		}
	}

	// 大頂堆
	private PriorityQueue<Integer> left = new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a));
	// compare -1 b<a, 0 a==b, 1 b>a
	// 默認小頂堆
	private PriorityQueue<Integer> right = new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b));
	// compare -1 a<b , 0 a==b, 1 a>b

	public static void main(String[] args) {
		// 以上浮為例,大概的實現邏輯
		// Comparator<Integer> cmp = (a, b) -> Integer.compare(a, b); // 小頂堆比較器 compare
		// -1 a<b , 0 a==b, 1 a>b
		Comparator<Integer> cmp = (a, b) -> Integer.compare(b, a); // 大頂堆比較器 compare
		// -1 b<a, 0 a==b, 1 b>a

		int a = 10;
		int b = 25;
		if (cmp.compare(a, b) > 0) {
			System.out.println("上浮");
		} else {
			System.out.println("停止上浮");
		}
	}
}
