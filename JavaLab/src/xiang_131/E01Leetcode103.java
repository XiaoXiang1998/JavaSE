package xiang_131;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import xiang_129.TreeNode;

public class E01Leetcode103 {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int c1 = 1; // 當前層節點數
		boolean odd = true;// 奇數層
		while (!queue.isEmpty()) {
			LinkedList<Integer> level = new LinkedList<Integer>(); // 保存每一層結果
			int c2 = 0; // 下一次節點數
			for (int i = 0; i < c1; i++) {
				TreeNode n = queue.poll();
				if (odd) {
					level.offerLast(n.val);
				} else {
					level.offerFirst(n.val);
				}
				if (n.left != null) {
					queue.offer(n.left);
					c2++;
				}
				if (n.right != null) {
					queue.offer(n.right);
					c2++;
				}
			}
			odd = !odd;
			result.add(level);
			c1 = c2;
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(new TreeNode(new TreeNode(4), 2, new TreeNode(5)), 1,
				new TreeNode(new TreeNode(6), 3, new TreeNode(7)));

		E01Leetcode103 s = new E01Leetcode103();
		System.out.println(s.zigzagLevelOrder(root));
	}
}
