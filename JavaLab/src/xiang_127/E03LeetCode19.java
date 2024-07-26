package xiang_127;

public class E03LeetCode19 {

	// 方法1
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode s = new ListNode(-1, head);
		recursion(s, n);
		return s.next;
	}

	public int recursion(ListNode p, int n) {
		if (p == null) {
			return 0;
		}
		int nth = recursion(p.next, n); // 下一個節點的倒數位置
		System.out.println(p.val + " " + nth);
		if (nth == n) {
			// p=3 p.next=4 p.next.next=5
			p.next = p.next.next;
		}
		return nth + 1;
	}

	// 方法2
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode s = new ListNode(-1, head);
		ListNode p1 = s;
		ListNode p2 = s;
		for (int i = 0; i < n + 1; i++) {
			p2 = p2.next;
		}
		while (p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		p1.next = p1.next.next;
		return s.next;
	}

	public static void main(String[] args) {
		ListNode o5 = new ListNode(5, null);
		ListNode o4 = new ListNode(4, o5);
		ListNode o3 = new ListNode(3, o4);
		ListNode o2 = new ListNode(2, o3);
		ListNode o1 = new ListNode(1, o2);

		System.out.println(o1);

		System.out.println(new E03LeetCode19().removeNthFromEnd(o1, 2));
	}

}
