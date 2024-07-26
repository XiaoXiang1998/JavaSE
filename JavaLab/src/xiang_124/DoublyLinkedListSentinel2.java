package xiang_124;

import java.util.Iterator;

public class DoublyLinkedListSentinel2 implements Iterable<Integer> {

	private static class Node {
		Node prev;
		int value;
		Node next;

		public Node(Node prev, int value, Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
	}

	private Node sentinel = new Node(null, -1, null);

	public DoublyLinkedListSentinel2() {
		sentinel.prev = sentinel;
		sentinel.next = sentinel;
	}

	public void addFirst(int value) {
		Node a = sentinel;
		Node b = sentinel.next;
		Node added = new Node(a, value, b);
		a.next = added;
		b.prev = added;
	}

	public void addLast(int value) {
		Node a = sentinel.prev;
		Node b = sentinel;
		Node added = new Node(a, value, b);
		a.next = added;
		b.prev = added;
	}

	public void removeFirst() {
		Node removed = sentinel.next;
		if (removed == sentinel) {
			throw new IllegalArgumentException("非法的");
		}
		Node a = sentinel;
		Node b = removed.next;

		a.next = b;
		b.prev = a;

	}

	public void removeLast() {
		Node removed = sentinel.prev;
		if (removed == sentinel) {
			throw new IllegalArgumentException("非法的");
		}
		Node a = removed.prev;
		Node b = sentinel;
		a.next = b;
		b.prev = a;
	}

	public void removeByvalue(int value) {
		Node removed = findByvalue(value);
		if (removed == null) {
			return; // 不用刪
		}
		Node a = removed.prev;
		Node b = removed.next;
		a.next = b;
		b.prev = a;
	}

	private Node findByvalue(int value) {
		Node p = sentinel.next;
		while (p != sentinel) {
			if (p.value == value) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			Node p = sentinel.next;

			@Override
			public Integer next() {
				int value = p.value;
				p = p.next;
				return value;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return p != sentinel;
			}
		};
	}

	public static void main(String[] args) {
		DoublyLinkedListSentinel2 doublyLinkedListSentinel2 = new DoublyLinkedListSentinel2();
		doublyLinkedListSentinel2.addLast(1);
		doublyLinkedListSentinel2.addLast(2);
		doublyLinkedListSentinel2.addLast(3);
		doublyLinkedListSentinel2.addLast(4);
		doublyLinkedListSentinel2.removeByvalue(2);
		for (Integer integer : doublyLinkedListSentinel2) {
			System.out.println(integer);
		}
	}

}
