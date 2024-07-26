package xiang_126;

import java.util.LinkedList;

public class E02HanoiTower {
	static LinkedList<Integer> a = new LinkedList<Integer>();
	static LinkedList<Integer> b = new LinkedList<Integer>();
	static LinkedList<Integer> c = new LinkedList<Integer>();

	// 3 2 1

	static void init(int n) {
		for (int i = n; i >= 1; i--) {
			a.addLast(i);
		}
	}

	/*
	 * n圓盤個數 a 原柱子 b 借的柱子 c 目標柱子
	 */

	static void move(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
		if (n == 0) {
			return;
		}

		move(n - 1, a, c, b); // 把n-1個盤子由a ,借c 移至b
		c.addLast(a.removeLast()); // 把最後的盤子由a移至c
		print();
		move(n - 1, b, a, c); // 把n-1個 盤子 由b,借a,移至c
	}

	// T(n)=2T(n-1)+c

	public static void main(String[] args) {
		init(3);
		print();
		move(3, a, b, c);
	}

	private static void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("----------");
	}
}
