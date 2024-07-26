package xiang_124;

import java.util.Iterator;

public class DoublyLinkedListSentinel implements Iterable<Integer> {
	static class Node {
		Node prev; // 上一個節點指針
		int value;
		Node next; // 下一個節點指針

		public Node(Node prev, int value, Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}

	}

	private Node head; // 頭哨兵
	private Node tail; // 尾哨兵

	public DoublyLinkedListSentinel() {
		head = new Node(null, 666, null);
		tail = new Node(null, 888, null);
		head.next = tail;
		tail.prev = head;

	}

	private Node findNode(int index) {
		int i = -1;
		for (Node p = head; p != tail; p = p.next, i++) {
			if (i == index) {
				return p;
			}
		}
		return null;
	}

	public void addFirst(int value) {
		insert(0, value);
	}

	public void addLast(int value) {
		Node last = tail.prev;
		Node added = new Node(last, value, tail);
		last.next = added;
		tail.prev = added;
	}

	public void removeLast() {
		Node removed = tail.prev; // 透過尾哨兵找到被刪除節點
		if (removed == head) {
			throw illegalIndex(0);
		}
		Node prev = removed.prev; // 找到被刪除節點的上一個節點
		prev.next = tail; // 上一個節點指向尾哨兵
		tail.prev = prev; // 尾哨兵指向上一個節點
	}

	public void insert(int index, int value) {
		Node prev = findNode(index - 1); // 上一個節點
		if (prev == null) {
			throw illegalIndex(index);
		}
		Node next = prev.next; // 下一個節點
		Node inserted = new Node(prev, value, next);
		prev.next = inserted;
		next.prev = inserted;
	}

	public void removeFirst() {
		remove(0);
	}

	public void remove(int index) {
		Node prev = findNode(index - 1);
		if (prev == null) {
			throw illegalIndex(index);
		}
		Node removed = prev.next;
		if (removed == tail) {
			throw illegalIndex(index);
		}
		Node next = removed.next;

		prev.next = next;
		next.prev = prev;
	}

	private IllegalArgumentException illegalIndex(int index) {
		throw new IllegalArgumentException(String.format("index [%d] 不合法%n", index));
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			Node p = head.next;

			@Override
			public Integer next() {
				int value = p.value;
				p = p.next;
				return value;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return p != tail;
			}
		};
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoublyLinkedListSentinel [head=");
		builder.append(head);
		builder.append(", tail=");
		builder.append(tail);
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
		doublyLinkedListSentinel.addFirst(1);
		doublyLinkedListSentinel.addLast(2);
		Node node = doublyLinkedListSentinel.findNode(0);
		System.out.println(node);

		for (Integer integer : doublyLinkedListSentinel) {
			System.out.println(integer);
		}
	}
}
