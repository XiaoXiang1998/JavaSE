package xiang_132;

import xiang_127.E07LeetCode23;
import xiang_127.ListNode;

public class E01Leetcode23 {
	public ListNode mergeKLists(ListNode[] lists) {
		MinHeap heap = new MinHeap(lists.length);
		// 將鏈錶的頭節點加入到小頂堆
		for (ListNode h : lists) {
			if (h != null) {
				heap.offer(h);
			}
		}
		// 2.不斷從堆頂移除最小元素,加入新鏈表
		ListNode s = new ListNode(-1, null);
		ListNode t = s;
		while (!heap.isEmpty()) {
			ListNode min = heap.poll();
			t.next = min;
			t = min;
			if (min.next != null) {
				heap.offer(min.next);
			}
		}
		return s.next;
	}

	public static void main(String[] args) {
		ListNode o5 = new ListNode(10, null);
		ListNode o4 = new ListNode(9, o5);
		ListNode o3 = new ListNode(8, o4);
		ListNode o2 = new ListNode(3, o3);
		ListNode o1 = new ListNode(1, o2);

		ListNode o10 = new ListNode(35, null);
		ListNode o9 = new ListNode(24, o10);
		ListNode o8 = new ListNode(13, o9);
		ListNode o7 = new ListNode(3, o8);
		ListNode o6 = new ListNode(1, o7);

		ListNode o15 = new ListNode(66, null);
		ListNode o14 = new ListNode(61, o15);
		ListNode o13 = new ListNode(55, o14);
		ListNode o12 = new ListNode(44, o13);
		ListNode o11 = new ListNode(38, o12);

		ListNode[] lists = { o1, o6, o11 };

		ListNode m = new E07LeetCode23().mergeLists(lists);
		System.out.println(m);
	}
}
