package xiang_135;

import xiang_129.TreeNode;

public class E05Leetcode104_1 {

	public int maxDepth(TreeNode node) {
		if (node == null) {
			return 0;
		}
		/*
		 * if (node.left == null && node.right == null) { 不加也可以 return 1; }
		 */
		int d1 = maxDepth(node.left);
		int d2 = maxDepth(node.right);
		return Integer.max(d1, d2) + 1;
	}

	public static void main(String[] args) {
		// TreeNode root = new TreeNode(new TreeNode(2), 1, new TreeNode(2));
		// TreeNode root = new TreeNode(new TreeNode(2), 1, new TreeNode(null, 3, new
		// TreeNode(4)));
		TreeNode root = new TreeNode(1);

		System.out.println(new E05Leetcode104_1().maxDepth(root));
	}
}
