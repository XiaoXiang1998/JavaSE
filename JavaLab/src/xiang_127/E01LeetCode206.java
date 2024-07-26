package xiang_127;

public class E01LeetCode206 {
	// 方法1
	public ListNode reverseList1(ListNode o1) {
		ListNode n1 = null;

		ListNode p = o1;
		while (p != null) {
			n1 = new ListNode(p.val, n1);
			p = p.next;
		}
		return n1;
	}

	// 方法2
	public ListNode reverseList2(ListNode head) {
		List list1 = new List(head);
		List list2 = new List(null);
		while (true) {
			ListNode first = list1.removeFirst();
			if (first == null) {
				break;
			}
			list2.addFirst(first);
		}
		return list2.head;
	}

	// 方法3 -遞迴
	/*
	 * 1.2.3.4.5
	 */
	public ListNode reverseList3(ListNode p) {
		if (p == null || p.next == null) { // 不足兩個節點
			return p; // 最後節點
		}
		ListNode last = reverseList3(p.next);
		// 遞迴時用5指向當前節點4
		p.next.next = p;
		// 4要指向null 不然會死循環
		p.next = null;
		return last;
	}

	// 方法4
	public ListNode reverseList4(ListNode o1) {
		// 1.空鏈表 2.一個元素
		if (o1 == null || o1.next == null) {
			return o1;
		}
		/*
		 * n1 o1 1->2->3->4->5->null
		 * 
		 * old1 new1
		 */
		ListNode o2 = o1.next;
		// 指向頭節點
		ListNode n1 = o1;
		while (o2 != null) {
			o1.next = o2.next; // 2
			o2.next = n1; // 3
			n1 = o2; // 4
			o2 = o1.next; // 5
		}
		return n1;

	}

	// 方法5
	public ListNode reverseList(ListNode o1) {
		if (o1 == null || o1.next == null) {
			return o1;
		}
		/*
		 * o1 1->2->3->4->5 ->null n1 null
		 */
		ListNode n1 = null;
		while (o1 != null) {
			ListNode o2 = o1.next; // 2
			o1.next = n1; // 3
			n1 = o1; // 4
			o1 = o2;
		}
		return n1;
	}

	static class List {
		ListNode head;

		public List(ListNode head) {

			this.head = head;
		}

		public void addFirst(ListNode first) {
			// 讓待添加節點指向原來head
			first.next = head;

			// 讓head更新成first
			head = first;
		}

		// 返回被移除節點
		public ListNode removeFirst() {
			// 拿到頭節點
			ListNode first = head;
			if (first != null) {
				// 把第二個節點覆值給新的頭節點
				head = first.next;
			}
			return first;
		}
	}

	public static void main(String[] args) {
		ListNode o5 = new ListNode(5, null);
		ListNode o4 = new ListNode(4, o5);
		ListNode o3 = new ListNode(3, o4);
		ListNode o2 = new ListNode(2, o3);
		ListNode o1 = new ListNode(1, o2);
		System.out.println(o1);

		ListNode n1 = new E01LeetCode206().reverseList3(o1);
		System.out.println(n1);
	}
}
