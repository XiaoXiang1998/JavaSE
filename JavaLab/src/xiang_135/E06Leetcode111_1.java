package xiang_135;

import xiang_129.TreeNode;

/*
 * 二叉樹最小深度-後序邊勵實現
 */
public class E06Leetcode111_1 {

	public int minDepth(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int d1 = minDepth(node.left); // 1
		int d2 = minDepth(node.right); // 0
		if (d2 == 0) { // 當右子樹為null
			return d1 + 1; // 返回左子樹+1
		}
		if (d1 == 0) { // 當左子樹為null
			return d2 + 1; // 返回右子樹+1
		}
		return Integer.min(d1, d2) + 1;
	}
}
