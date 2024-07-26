package xiang_124;

import java.util.Iterator;
import java.util.function.Consumer;

/*
 * 單向鏈表
 */
public class TestSinglyLinkedListSentinel implements Iterable<Integer> { // 整體
	private Node head = new Node(666, null); // 頭指針

	@Override
	public Iterator<Integer> iterator() {
		// 匿名內部類 ->帶名字內部類
		return new NodeIterator();

	}

	private class NodeIterator implements Iterator<Integer> {
		Node p = head.next;

		@Override
		public Integer next() {
			// 返回當前元素的值,並指向下一個元素
			int v = p.value;
			p = p.next;
			return v;
		}

		@Override
		public boolean hasNext() { // 是否有下一個元素
			return p != null;
		}
	}

	/*
	 * 
	 * 節點類
	 */
	private static class Node {
		int value; // 值
		Node next; // 下一個節點指針

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

	public void addFirst(int value) {
		insert(0, value);
	}

	public void loop1(Consumer<Integer> consumer) {
		Node p = head.next;
		while (p != null) {
			consumer.accept(p.value);
			p = p.next;
		}
	}

	public void loop2(Consumer<Integer> consumer) {
		for (Node p = head.next; p != null; p = p.next) {
			consumer.accept(p.value);

		}
	}

	private Node findLast() {

		Node p;
		for (p = head; p.next != null; p = p.next) {

		}
		return p;
	}

	public void addLast(int value) {
		Node last = findLast();
		last.next = new Node(value, null);
	}

	public void test() {
		int i = 0;
		for (Node p = head; p != null; p = p.next, i++) {
			System.out.println(p.value + "索引是:" + i);
		}
	}

	private Node findNode(int index) {
		int i = -1;
		for (Node p = head; p != null; p = p.next, i++) {
			if (i == index) {
				return p;
			}
		}
		return null; // 沒找到
	}

	public int get(int index) {
		Node node = findNode(index);
		if (node == null) {
			// 拋異常
			illegalIndex(index);
		}
		return node.value;
	}

	private IllegalArgumentException illegalIndex(int index) {
		throw new IllegalArgumentException(String.format("index [%d] 不合法%n", index));
	}

	public void insert(int index, int value) {
		Node prev = findNode(index - 1); // 找到上一個節點
		if (prev == null) { // 找不到
			illegalIndex(index);
		}
		prev.next = new Node(value, prev.next);
	}

	public void removeFirst() {
		remove(0);
	}

	public void remove(int index) {

		Node prev = findNode(index - 1); // 上一個節點
		if (prev == null) {
			throw illegalIndex(index);
		}
		Node removed = prev.next; // 被刪除的節點
		if (removed == null) {
			throw illegalIndex(index);
		}
		prev.next = removed.next;

	}

	public static void main(String[] args) {
		TestSinglyLinkedListSentinel list = new TestSinglyLinkedListSentinel();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3); // 2
		list.addLast(4); // 3
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
