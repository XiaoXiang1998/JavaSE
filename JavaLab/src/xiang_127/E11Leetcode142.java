package xiang_127;

public class E11Leetcode142 {

	public ListNode detectCycle(ListNode head) {
		ListNode h = head; // 兔子指針 一次兩格
		ListNode t = head; // 烏龜指針
		while (h != null && h.next != null) {
			t = t.next;
			h = h.next.next;
			if (h == t) {
				// 進入第二階段
				t = head;
				while (true) {
					if (t == h) { // 第二次相似
						return t;
					}
					t = t.next;
					h = h.next;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ListNode o12 = new ListNode(44, null);
		ListNode o11 = new ListNode(38, o12);
		ListNode o10 = new ListNode(35, o11);
		ListNode o9 = new ListNode(24, o10);
		ListNode o8 = new ListNode(13, o9);
		ListNode o7 = new ListNode(3, o8);
		ListNode o6 = new ListNode(1, o7);
		ListNode o5 = new ListNode(10, o6);
		ListNode o4 = new ListNode(9, o5);
		ListNode o3 = new ListNode(8, o4);
		ListNode o2 = new ListNode(3, o3);
		ListNode o1 = new ListNode(1, o2);

		o12.next = o1;

		System.out.println(new E11Leetcode142().detectCycle(o1).val);

	}
}
