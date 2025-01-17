package xiang_135;

import xiang_129.TreeNode;
import xiang_130.LinkedListStack;

public class E02Leetcode94 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, null), 1,
				new TreeNode(new TreeNode(5), 3, new TreeNode(6)));

		LinkedListStack<TreeNode> stack = new LinkedListStack<TreeNode>(10);

		TreeNode curr = root; // 代表當前節點

		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				// colorPrintln("去:" + curr.val, 31);
				stack.push(curr); // 壓入棧,為了記住回來的路
				curr = curr.left;
			} else {
				TreeNode pop = stack.pop();
				colorPrintln("回:" + pop.val, 34);
				curr = pop.right;
			}
		}
	}

	private static void colorPrintln(String origin, int color) {
		System.out.printf("\033[%dm%s\033[0m%n", color, origin);
	}
}
