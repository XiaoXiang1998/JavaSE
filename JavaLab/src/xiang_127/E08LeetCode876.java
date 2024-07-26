package xiang_127;

public class E08LeetCode876 {

	public ListNode middleNode(ListNode head) {
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
			p2 = p2.next;
		}
		return p1;
	}

	public static void main(String[] args) {
		ListNode o6 = new ListNode(13, null);
		ListNode o5 = new ListNode(10, o6);
		ListNode o4 = new ListNode(9, o5);
		ListNode o3 = new ListNode(8, o4);
		ListNode o2 = new ListNode(3, o3);
		ListNode o1 = new ListNode(1, o2);
		System.out.println(new E08LeetCode876().middleNode(o1));
	}
}
