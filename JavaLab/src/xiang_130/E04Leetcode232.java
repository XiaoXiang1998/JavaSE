package xiang_130;

public class E04Leetcode232 {

	ArrayStack<Integer> s1 = new ArrayStack<Integer>(100);
	ArrayStack<Integer> s2 = new ArrayStack<Integer>(100);

	public void push(int x) { // 向隊列尾添加
		s2.push(x);
	}

	public int pop() { // 從對列頭移除
		if (s1.isEmpty()) {
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		return s1.pop();
	}

	public int peek() {
		if (s1.isEmpty()) {
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		return s1.peek();
	}

	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
}
