package xiang_127;

public class E04Leetcode83 {

	public ListNode deleteDuplicates1(ListNode head) {
		if (head == null || head.next == null) {
			// 當節點數小於2
			return head;
		}
		// 節點數>=2
		ListNode p1 = head;
		ListNode p2;
		while ((p2 = p1.next) != null) {
			if (p1.val == p2.val) {
				// 刪除p2
				p1.next = p2.next;
			} else {
				// 向後平移
				p1 = p1.next;
			}
		}
		return head;

	}

	public ListNode deleteDuplicates(ListNode p) {
		if (p == null || p.next == null) {
			return p;
		}

		if (p.val == p.next.val) {
			return deleteDuplicates(p.next);
		} else {
			p.next = deleteDuplicates(p.next);
			return p;
		}

	}

	public static void main(String[] args) {
		ListNode o5 = new ListNode(3, null);
		ListNode o4 = new ListNode(3, o5);
		ListNode o3 = new ListNode(2, o4);
		ListNode o2 = new ListNode(1, o3);
		ListNode o1 = new ListNode(1, o2);

		System.out.println(o1);
		System.out.println(new E04Leetcode83().deleteDuplicates(o1));
	}

}
