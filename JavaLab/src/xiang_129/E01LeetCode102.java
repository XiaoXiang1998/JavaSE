package xiang_129;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E01LeetCode102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int c1 = 1; // 當前層節點數
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>(); // 保存每一層結果
			int c2 = 0; // 下一次節點數
			for (int i = 0; i < c1; i++) {
				TreeNode n = queue.poll();
				level.add(n.val);
				if (n.left != null) {
					queue.offer(n.left);
					c2++;
				}
				if (n.right != null) {
					queue.offer(n.right);
					c2++;
				}
			}
			result.add(level);
			c1 = c2;
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, new TreeNode(5)), 1,
				new TreeNode(new TreeNode(6), 3, new TreeNode(7)));

		LinkedListQueue<TreeNode> queue = new LinkedListQueue<TreeNode>();
		queue.offer(root);
		int c1 = 1; // 當前層節點數
		while (!queue.isEmpty()) {
			int c2 = 0; // 下一次節點數
			for (int i = 0; i < c1; i++) {
				TreeNode n = queue.poll();
				System.out.print(n + " ");
				if (n.left != null) {
					queue.offer(n.left);
					c2++;
				}
				if (n.right != null) {
					queue.offer(n.right);
					c2++;
				}
			}
			System.out.println();
			c1 = c2;
		}
	}
}
