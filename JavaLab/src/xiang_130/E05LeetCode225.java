package xiang_130;

import xiang_129.ArrayQueue3;

public class E05LeetCode225 {

	ArrayQueue3<Integer> queue = new ArrayQueue3<Integer>(100);
	private int size = 0;

	public void push(int x) { // 向隊列尾添加
		queue.offer(x);
		for (int i = 0; i < size; i++) {
			queue.offer(queue.poll());
		}
		size++;
	}

	public int pop() { // 從對列頭移除
		size--;
		return queue.poll();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}
}
