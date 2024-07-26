package xiang_130;

import java.util.LinkedList;

public class E02Leetcode150 {

	public int evalRPN(String[] tokens) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		for (String t : tokens) {
			switch (t) {
			case "+" -> {
				Integer b = stack.poll();
				Integer a = stack.poll();
				stack.push(a + b);

			}
			case "-" -> {
				Integer b = stack.poll();
				Integer a = stack.poll();
				stack.push(a - b);
			}
			case "*" -> {
				Integer b = stack.poll();
				Integer a = stack.poll();
				stack.push(a * b);
			}
			case "/" -> {
				Integer b = stack.poll();
				Integer a = stack.poll();
				stack.push(a / b);
			}
			default -> { // 數字
				stack.push(Integer.parseInt(t));
			}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
		System.out.println(new E02Leetcode150().evalRPN(tokens));
		tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(new E02Leetcode150().evalRPN(tokens));
	}
}
