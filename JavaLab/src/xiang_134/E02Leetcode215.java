package xiang_134;

public class E02Leetcode215 {
	public int findKthLargest(int[] numbers, int k) {
		MinHeap heap = new MinHeap(k);
		for (int i = 0; i < k; i++) {
			heap.offer(numbers[i]);
		}
		for (int i = k; i < numbers.length; i++) {
			if (numbers[i] > heap.peek()) {
				heap.replace(numbers[i]);
			}
		}
		return heap.peek();
	}

	public static void main(String[] args) {
		System.out.println(new E02Leetcode215().findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
		System.out.println(new E02Leetcode215().findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4));

	}
}
