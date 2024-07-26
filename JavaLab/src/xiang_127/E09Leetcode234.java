package xiang_127;

public class E09Leetcode234 {

	public boolean isPalindrome(ListNode head) {
		/*
		 * 步驟1.找中間點 步驟2.中間點後半個鏈表反轉 步驟3.反轉後鏈表與原鏈表逐一比較
		 */
		ListNode middle = middle(head);
		System.out.println(middle);
		ListNode newHead = reverse(middle);
		System.out.println(newHead);
		System.out.println(head);
		while (newHead != null) {
			if (newHead.val != head.val) {
				return false;
			}
			newHead = newHead.next;
			head = head.next;
		}
		return true;
	}

	public boolean isPalindrome1(ListNode head) {
		/*
		 * 步驟1 .找中間點的同時反轉前半個鏈表 步驟2.反轉後的錢半個鏈表 與中間開始的後半個鏈表逐一比較
		 */
		ListNode p1 = head; // 曼指針 一次一步
		ListNode p2 = head; // 快指針 一次兩步
		ListNode n1 = null; // 新頭
		ListNode o1 = head; // 舊頭
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;

			// 反轉鏈表
			o1.next = n1;
			n1 = o1;
			o1 = p1;
		}
		System.out.println(n1);
		System.out.println(p1);
		if (p2 != null) { // 奇數節點
			p1 = p1.next;
		}

		while (n1 != null) {
			if (n1.val != p1.val) {
				return false;
			}
			n1 = n1.next;
			p1 = p1.next;
		}

		return true;
	}

	private ListNode reverse(ListNode o1) {
		ListNode n1 = null;
		while (o1 != null) {
			ListNode o2 = o1.next;
			o1.next = n1;
			n1 = o1;
			o1 = o2;
		}
		return n1;
	}

	private ListNode middle(ListNode head) {
		ListNode p1 = head; // 曼指針 一次一步
		ListNode p2 = head; // 快指針 一次兩步
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		return p1;

	}

	public static void main(String[] args) {
		ListNode o4 = new ListNode(1, null);
		ListNode o3 = new ListNode(2, o4);
		ListNode o2 = new ListNode(2, o3);
		ListNode o1 = new ListNode(1, o2);

		System.out.println(new E09Leetcode234().isPalindrome1(o1));
	}
}
