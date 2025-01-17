package xiang_135;

import java.util.LinkedList;

import xiang_129.TreeNode;

public class E05Leetcode104_2 {
	/*
	 * 思路 1.使用非遞迴後序邊勵,棧的最大高度即為最大深度
	 */
	public int maxDepth(TreeNode root) {
		TreeNode curr = root;
		TreeNode pop = null;
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		int max = 0; // 棧的最大高度
		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				stack.push(curr);
				int size = stack.size();
				if (size > max) {
					max = size;
				}
				curr = curr.left;
			} else {
				TreeNode peek = stack.peek();
				if (peek.right == null || peek.right == pop) {
					pop = stack.pop();
				} else {
					curr = peek.right;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(2), 1, new TreeNode(2));
		// TreeNode root = new TreeNode(new TreeNode(2), 1, new TreeNode(null, 3, new
		// TreeNode(4)));
		// TreeNode root = new TreeNode(1);

		System.out.println(new E05Leetcode104_2().maxDepth(root));
	}
}
