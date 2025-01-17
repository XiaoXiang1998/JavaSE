package xiang_130;

import java.util.Iterator;

public class ArrayStack<E> implements Stack<E>, Iterable<E> {

	private E[] array;
	private int top; // 棧頂指針

	@SuppressWarnings("all")
	public ArrayStack(int capacity) {
		this.array = (E[]) new Object[capacity];
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int p = top;

			@Override
			public boolean hasNext() {

				return p > 0;
			}

			@Override
			public E next() {
				return array[--p];
			}
		};
	}

	@Override
	public boolean push(E value) {
		if (isFull()) {
			return false;
		}
		array[top++] = value;
		return true;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		}
		E value = array[top - 1]; // arr
		top--;
		return value;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		E value = array[top - 1];
		return value;
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public boolean isFull() {
		return top == array.length;
	}

	public static void main(String[] args) {

		ArrayStack<Integer> stack = new ArrayStack<Integer>(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		for (Integer integer : stack) {
			System.out.println(integer);
		}
	}

}
