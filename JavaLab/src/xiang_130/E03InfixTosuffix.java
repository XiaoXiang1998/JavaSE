package xiang_130;

import java.util.LinkedList;

public class E03InfixTosuffix {
	public static void main(String[] args) {
//		System.out.println(infixTosuffix("a+b"));
//		System.out.println(infixTosuffix("a+b-c"));
//		System.out.println(infixTosuffix("a+b*c"));
//		System.out.println(infixTosuffix("a*b-c"));
		System.out.println(infixTosuffix("(a+b)*c"));
		System.out.println(infixTosuffix("(a+b*c-d)*e"));
		System.out.println(infixTosuffix("a*(b+c)"));
	}

	static int priority(char c) {
		return switch (c) {
		case '*', '/' -> 2;
		case '+', '-' -> 1;
		case '(' -> 0;
		default -> throw new IllegalArgumentException("不合法的運算符:" + c);
		};
	}

	static String infixTosuffix(String exp) {
		LinkedList<Character> stack = new LinkedList<Character>();
		StringBuilder sb = new StringBuilder(exp.length());
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			switch (c) {
			case '*', '/', '+', '-' -> {
				if (stack.isEmpty()) {
					stack.push(c);
				} else {
					if (priority(c) > priority(stack.peek())) {
						stack.push(c);
					} else {
						while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
							sb.append(stack.pop());
						}
						stack.push(c);
					}
				}
			}
			case '(' -> {
				stack.push(c);
			}
			case ')' -> {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			default -> {
				sb.append(c);
			}
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}
}
