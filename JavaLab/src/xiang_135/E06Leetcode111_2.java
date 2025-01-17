package xiang_135;

import java.util.LinkedList;
import java.util.Queue;

import xiang_129.TreeNode;

/*
 * 二叉樹最小深度-層序邊勵實現
 */
public class E06Leetcode111_2 {
	/*
	 * 層序邊勵:遇到的第一個葉子節點所在層就是最小深度
	 */
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int depth = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			depth++;
			for (int i = 0; i < size; i++) {
				TreeNode poll = queue.poll();
				if (poll.left == null && poll.right == null) {
					return depth;
				}
				if (poll.left != null) {
					queue.offer(poll.left);
				}
				if (poll.right != null) {
					queue.offer(poll.right);
				}
			}

		}
		return depth;
	}

	public static void main(String[] args) {
		// TreeNode root = new TreeNode(new TreeNode(2), 1, null);
		TreeNode root = new TreeNode(1);
		System.out.println(new E06Leetcode111_2().minDepth(root));
	}
}
