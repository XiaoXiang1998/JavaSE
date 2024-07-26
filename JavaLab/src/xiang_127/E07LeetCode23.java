package xiang_127;

public class E07LeetCode23 {

	public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
		ListNode s = new ListNode(-1, null);
		ListNode p = s;
		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;

			}
			p = p.next;
		}
		if (p1 != null) {
			p.next = p1;
		}
		if (p2 != null) {
			p.next = p2;
		}
		return s.next;
	}

	public ListNode mergeLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		return split(lists, 0, lists.length - 1);
	}

	// 返回合併後的鏈表,i,j 代表左右邊界
	private ListNode split(ListNode[] lists, int i, int j) {
		if (i == j) { // 數組內只有一個鏈表
			return lists[i];
		}

		int m = (i + j) >>> 1;
		ListNode left = split(lists, i, m);
		ListNode right = split(lists, m + 1, j);
		return mergeTwoLists(left, right);
	}

	private static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("null");
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
		printList(m);
	}
}
