package xiang_135;

import xiang_129.TreeNode;

public class E04Leetcode101 {
	public boolean isSymmetric(TreeNode root) {
		return check(root.left, root.right);
	}
	// 1,2,2,3,4,4,3,5,6,7,8,8,7,6,5

	private boolean check(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		// left right 不能同時為null
		if (right == null || left == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		return check(left.left, right.right) && check(left.right, right.left);
	}

	public static void main(String[] args) {
		// TreeNode root = new TreeNode(new TreeNode(null, 2, new TreeNode(3)), 1, new
		// TreeNode(null, 2, new TreeNode(3)));
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(3), 2, new TreeNode(4)), 1,
				new TreeNode(new TreeNode(4), 2, new TreeNode(3)));

		System.out.println(new E04Leetcode101().isSymmetric(root));
	}
}
