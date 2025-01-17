package xiang_129;

import java.util.Iterator;

/*
 * 基於單向環形隊列實現
 * Type parameters:<E> 隊列中元素類型
 */
public class LinkedListQueue<E> implements Queue<E>, Iterable<E> {
	private int size; // 節點數
	private int capacity = Integer.MAX_VALUE;// 容量

	private static class Node<E> {
		private E value;
		private Node<E> next;

		public Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}
	}

	Node<E> head = new Node<>(null, null);
	Node<E> tail = head;
	{
		tail.next = head;
	}

	public LinkedListQueue(int capacity) {
		this.capacity = capacity;

	}

	public LinkedListQueue() {
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			Node<E> p = head.next;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return p != head;
			}

			@Override
			public E next() {
				E value = p.value;
				p = p.next;
				return value;
			}

		};
	}

	@Override
	public boolean offer(E value) {
		if (isFull()) {
			return false;
		}

		Node<E> added = new Node<>(value, head);
		tail.next = added;
		tail = added;
		size++;
		return true;
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		Node<E> first = head.next;
		head.next = first.next;
		size--;
		if (first == tail) {
			tail = head;
		}

		return first.value;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return head.next.value;
	}

	@Override
	public boolean isEmpty() {
		return head == tail;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	public static void main(String[] args) {
		LinkedListQueue<Integer> queue = new LinkedListQueue<Integer>(22);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);

		boolean full = queue.isFull();
		System.out.println(full);
		for (Integer integer : queue) {
			System.out.println(integer);
		}

	}

}
