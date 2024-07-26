package xiang_124;

import java.util.Iterator;
import java.util.function.Consumer;

/*
 * 單向鏈表
 */
public class SinglyLinkedList implements Iterable<Integer> { // 整體
	private Node head = null; // 頭指針

	@Override
	public Iterator<Integer> iterator() {
		// 匿名內部類 ->帶名字內部類
		return new NodeIterator();

	}

	private class NodeIterator implements Iterator<Integer> {
		Node p = head;

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
		// 1.鏈表為空的情況
		// head = new Node(value, null);
		// 2.鏈表非空的
		head = new Node(value, head);
	}

	public void loop1(Consumer<Integer> consumer) {
		Node p = head;
		while (p != null) {
			consumer.accept(p.value);
			p = p.next;
		}
	}

	public void loop2(Consumer<Integer> consumer) {
		for (Node p = head; p != null; p = p.next) {
			consumer.accept(p.value);

		}
	}

	public void loop3(Consumer<Integer> before, Consumer<Integer> after) {
		recursion(head, before, after);
	}

	private void recursion(Node curr, Consumer<Integer> before, Consumer<Integer> after) { // 某個節點要進行的操作
		if (curr == null) {
			return;
		}
		before.accept(curr.value);
		recursion(curr.next, before, after);
		after.accept(curr.value);
	}

	private Node findLast() {
		if (head == null) { // 空鏈表
			return null;
		}

		Node p;
		for (p = head; p.next != null; p = p.next) {

		}
		return p;
	}

	public void addLast(int value) {
		Node last = findLast();

		if (last == null) {
			addFirst(value);
			return;
		}

		last.next = new Node(value, null);
	}

	public void test() {
		int i = 0;
		for (Node p = head; p != null; p = p.next, i++) {
			System.out.println(p.value + "索引是:" + i);
		}
	}

	private Node findNode(int index) {
		int i = 0;
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
		if (index == 0) {
			addFirst(value);
			return;
		}
		Node prev = findNode(index - 1); // 找到上一個節點
		if (prev == null) { // 找不到
			illegalIndex(index);
		}
		prev.next = new Node(value, prev.next);
	}

	public void removeFirst() {

		if (head == null) {
			throw illegalIndex(0);
		}
		head = head.next;
	}

	public void remove(int index) {
		if (index == 0) {
			removeFirst();
			return;
		}

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
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3); // 2
		list.addLast(4); // 3
		list.loop3(value -> {
			System.out.println("before:" + value);
		}, value -> {
			System.out.println("after:" + value);
		});
		// list.remove(5);

//		list.loop2(value -> {
//			System.out.println(value);
//		});

//		for (Integer integer : list) {
//			System.out.println(integer);
//		}

		// list.test();
//		Node node = list.findNode(0);
//		int i = list.get(10);
//		System.out.println(i);

//		list.insert(0 , 5);

	}

}
