package xiang_135;

import java.util.LinkedList;
import java.util.Queue;

import xiang_129.TreeNode;

public class E05Leetcode104_3 {
	/*
	 * 思路 1.使用層序邊勵,層數即最大深度
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int depth = 0;
		while (!queue.isEmpty()) {
			// queue.size()
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode poll = queue.poll();
				// System.out.print(poll.val + "\t");
				if (poll.left != null) {
					queue.offer(poll.left);
				}
				if (poll.right != null) {
					queue.offer(poll.right);
				}
			}
			// System.out.println();
			depth++;
		}
		return depth;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, new TreeNode(new TreeNode(7), 5, null)), 1,
				new TreeNode(null, 3, new TreeNode(6)));

		System.out.println(new E05Leetcode104_3().maxDepth(root));
	}
}
