package xiang_127;

public class E02LeetCode203 {
	/*
	 * Params: head-鏈表頭 val -目標值 Retuns:刪除後的鏈表頭
	 */

	public ListNode removeElements1(ListNode head, int val) {

		ListNode s = new ListNode(-1, head);
		ListNode p1 = s;
		ListNode p2 = s.next;
		while (p2 != null) {
			if (p2.val == val) {
				// 刪除,p2向後平移
				p1.next = p2.next;
				p2 = p2.next; // p2=p1.next 找到p1後面的元素
			} else {
				// p1 p2 向後平移
				p1 = p1.next;
				p2 = p2.next; // p2=p1.next 找到p1後面的元素
			}
		}
		return s.next;
	}

	public ListNode removeElements2(ListNode head, int val) {

		ListNode s = new ListNode(-1, head);
		ListNode p1 = s;
		ListNode p2;
		while ((p2 = p1.next) != null) {
			if (p2.val == val) {
				// 刪除,p2向後平移
				p1.next = p2.next;
			} else {
				// p1 p2 向後平移
				p1 = p1.next;
			}
		}
		return s.next;
	}

	public ListNode removeElements(ListNode p, int val) {
		if (p == null) {
			return null;
		}
		if (p.val == val) {
			return removeElements(p.next, val);
		} else {
			p.next = removeElements(p.next, val);
			return p;
		}
	}

	public static void main(String[] args) {
		ListNode o6 = new ListNode(6, null);
		ListNode o5 = new ListNode(6, o6);
		ListNode o4 = new ListNode(3, o5);
		ListNode o3 = new ListNode(6, o4);
		ListNode o2 = new ListNode(2, o3);
		ListNode o1 = new ListNode(1, o2);

		ListNode removeElements = new E02LeetCode203().removeElements(o1, 6);
		System.out.println(removeElements);
	}
}
