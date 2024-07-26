package xiang_129;

import java.util.Iterator;

public class ArrayQueue3<E> implements Queue<E>, Iterable<E> {

	/*
	 * 求模運算: -如果除數是2的n次方 -那麼被除數的後n為即為餘數(模) -求被除數的後n位方法:與2^n-1按位與
	 */

	private final E[] array;
	private int head = 0;;
	private int tail = 0;

	@SuppressWarnings("all")
	public ArrayQueue3(int c) {
		// 1.拋異常
//		if ((capacity & capacity - 1) != 0) {
//			throw new IllegalArgumentException("capcity必須是2的n次冪");
//		}
		// 2.改成2^n 13->16 22->32
		c -= 1;
		c |= c >> 1;
		c |= c >> 2;
		c |= c >> 4;
		c |= c >> 8;
		c |= c >> 16;
		c += 1;
		array = (E[]) new Object[c];
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int p = head;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return p != tail;
			}

			@Override
			public E next() {
//				E value = array[(int) (Integer.toUnsignedLong(p) % array.length)];
				E value = array[p & (array.length - 1)];

				p++;
				return value;
			}
		};
	}

	@Override
	public boolean offer(E value) {
		if (isFull()) {
			return false;
		}
//		array[(int) (Integer.toUnsignedLong(tail) % array.length)] = value;
		array[tail & (array.length - 1)] = value;

		tail++;
		return true;
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
//		E value = array[(int) (Integer.toUnsignedLong(head) % array.length)];
		E value = array[head & (array.length - 1)];
		head++;
		return value;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}
//		E value = array[(int) (Integer.toUnsignedLong(head) % array.length)];
		E value = array[head & (array.length - 1)];

		return value;
	}

	@Override
	public boolean isEmpty() {
		return head == tail;
	}

	@Override
	public boolean isFull() {
		return tail - head == array.length;
	}

	public static void main(String[] args) {
		int c = 32;
		/*
		 * log2(x)=log10(x) /log10(2)
		 */
		/*
		 * int n = (int) (Math.log10(c - 1) / Math.log10(2)) + 1; System.out.println(n);
		 * System.out.println(1 << n);
		 */

		// 求離c最近,比c大的2^n(方法2)
		c -= 1;
		c |= c >> 1;
		c |= c >> 2;
		c |= c >> 4;
		c |= c >> 8;
		c |= c >> 16;
		c += 1;
		System.out.println(c);
	}
}
