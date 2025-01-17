package xiang_135;

import java.util.LinkedList;

import xiang_129.TreeNode;

public class E03Leetcode145 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, new TreeNode(7)), 1,
				new TreeNode(new TreeNode(5), 3, new TreeNode(6)));

		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

		TreeNode curr = root; // 代表當前節點
		TreeNode pop = null; // 最近一次彈棧的元素
		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				// colorPrintln("去:" + curr.val, 31);
				stack.push(curr); // 壓入棧,為了記住回來的路
				// 待處理左子樹
				colorPrintln("前:" + curr.val, 31);
				curr = curr.left;
			} else {
				TreeNode peek = stack.peek();// 棧頂元素
				// 沒有右子樹
				if (peek.right == null) {
					colorPrintln("中:" + peek.val, 36);
					pop = stack.pop();
					colorPrintln("後:" + pop.val, 34);
				}
				// 右子樹處理完成
				else if (peek.right == pop) {
					pop = stack.pop();
					colorPrintln("後:" + pop.val, 34);
				}
				// 待處理右子樹
				else {
					colorPrintln("中:" + peek.val, 36);
					curr = peek.right;
				}

			}
		}
	}

	private static void colorPrintln(String origin, int color) {
		System.out.printf("\033[%dm%s\033[0m%n", color, origin);
	}
}
