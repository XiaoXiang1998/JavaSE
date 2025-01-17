package xiang_135;

import xiang_129.TreeNode;

public class E07Leetcode226 {
	private TreeNode invertThree(TreeNode root) {
		fn(root);
		return root;
	}

	private static void fn(TreeNode node) {
		if (node == null) {
			return;
		}
		TreeNode t = node.left;
		node.left = node.right;
		node.right = t;

		fn(node.left);
		fn(node.right);
	}
}
