package xiang_131;

import java.util.Iterator;

/*
 * 
 * 基於雙向環形鏈表實現
 * Type parameters:<E> 隊列中元素類型
 */
public class LinkedListDeque<E> implements Dequq<E>, Iterable<E> {

	static class Node<E> {
		Node<E> prev;
		E value;
		Node<E> next;

		public Node(Node<E> prev, E value, Node<E> next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
	}

	int capacity;
	int size;
	Node<E> sentinel = new Node<>(null, null, null);

	public LinkedListDeque(int capacity) {
		this.capacity = capacity;
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			Node<E> p = sentinel.next;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return p != sentinel;
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
	public boolean offerFirst(E e) {
		if (isFull()) {
			return false;
		}
		Node<E> a = sentinel;
		Node<E> b = sentinel.next;
		Node<E> added = new Node<>(a, e, b);
		a.next = added;
		b.prev = added;
		size++;
		return true;
	}

	@Override
	public boolean offerLast(E e) {
		if (isFull()) {
			return false;
		}
		Node<E> a = sentinel.prev;
		Node<E> b = sentinel;
		Node<E> added = new Node<>(a, e, b);
		a.next = added;
		b.prev = added;
		size++;
		return true;
	}

	@Override
	public E pollFirst() {
		if (isEmpty()) {
			return null;
		}
		Node<E> a = sentinel;
		Node<E> removed = sentinel.next;
		Node<E> b = removed.next;
		a.next = b;
		b.prev = a;
		size--;
		return removed.value;
	}

	@Override
	public E pollLast() {
		if (isEmpty()) {
			return null;
		}
		Node<E> b = sentinel;
		Node<E> removed = sentinel.prev;
		Node<E> a = removed.prev;
		a.next = b;
		b.prev = a;
		size--;
		return removed.value;
	}

	@Override
	public E peekFirst() {
		if (isEmpty()) {
			return null;
		}
		return sentinel.next.value;
	}

	@Override
	public E peekLast() {
		if (isEmpty()) {
			return null;
		}
		return sentinel.prev.value;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	public static void main(String[] args) {
		LinkedListDeque<Integer> deque = new LinkedListDeque<Integer>(5);
		deque.offerFirst(1);
		deque.offerFirst(2);
		deque.offerFirst(3);
		deque.offerLast(4);
		deque.offerLast(5);
		deque.pollFirst();
		deque.pollLast();
		for (Integer integer : deque) {
			System.out.println(integer);
		}
	}
}
