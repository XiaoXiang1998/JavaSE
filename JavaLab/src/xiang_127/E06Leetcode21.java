package xiang_127;

public class E06Leetcode21 {

	public ListNode mergeTwoLists1(ListNode p1, ListNode p2) {
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

	public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
		if (p2 == null) {
			return p1;
		}
		if (p1 == null) {
			return p2;
		}

		if (p1.val < p2.val) {
			p1.next = mergeTwoLists(p1.next, p2); // p1剩餘部分 跟p2所有內容
			return p1;
		} else {
			p2.next = mergeTwoLists(p1, p2.next); // p1
			return p2;
		}
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
		ListNode o7 = new ListNode(12, o8);
		ListNode o6 = new ListNode(11, o7);

		System.out.println(new E06Leetcode21().mergeTwoLists(o1, o6));
	}
}
