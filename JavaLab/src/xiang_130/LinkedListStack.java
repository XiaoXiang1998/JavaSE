package xiang_130;

import java.util.Iterator;

public class LinkedListStack<E> implements Stack<E>, Iterable<E> {

	private int capacity;
	private int size;
	private Node<E> head = new Node<>(null, null);

	public LinkedListStack() {
	}

	public LinkedListStack(int capacity) {
		this.capacity = capacity;
	}

	static class Node<E> {
		E value;
		Node<E> next;

		public Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}

	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {

			Node<E> p = head.next;

			@Override
			public boolean hasNext() {
				return p != null;
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
	public boolean push(E value) {
		if (isFull()) {
			return false;
		}
		head.next = new Node<E>(value, head.next);
		size++;
		return true;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		}
		Node<E> first = head.next;
		head.next = first.next;
		size--;
		return first.value;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		Node<E> first = head.next;
		return first.value;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size == capacity;
	}

	public static void main(String[] args) {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>(3);
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(3);
		stack.push(4);
		for (Integer integer : stack) {
			System.out.println(integer);
		}
	}

}
