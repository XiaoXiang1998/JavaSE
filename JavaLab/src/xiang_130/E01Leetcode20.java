package xiang_130;

public class E01Leetcode20 {
	public boolean isvalid(String s) {
		ArrayStack<Character> stack = new ArrayStack<Character>(s.length());
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{') {
				stack.push('}');
			} else {
				if (!stack.isEmpty() && c == stack.peek()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	/*
	 * 
	 */

	public static void main(String[] args) {
		E01Leetcode20 s = new E01Leetcode20();
		System.out.println(s.isvalid("([{}])"));
		System.out.println(s.isvalid("()[]{}"));
		System.out.println(s.isvalid("()"));
		System.out.println(s.isvalid("[)"));
	}
}
