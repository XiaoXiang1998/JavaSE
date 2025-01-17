package xiang_135;

import java.util.Arrays;

import xiang_129.TreeNode;

public class E10Leetcode106 {
	/*
	 * 根據中序和後序邊勵結果構造二叉樹
	 */
	/*
	 * preOrder={1,2,4,3,6,7}; inOrder={4,2,1,6,3,7};
	 */
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length == 0 || postorder.length == 0) {
			return null;
		}
		// 找到根節點
		int rootvalue = postorder[postorder.length - 1];
		TreeNode root = new TreeNode(rootvalue);
		// 切分左右子樹
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == rootvalue) {
				int[] inLeft = Arrays.copyOfRange(inorder, 0, i); // 0~i-1
				int[] inRight = Arrays.copyOfRange(inorder, i + 1, inorder.length); // 0~i-1

				int[] postLeft = Arrays.copyOfRange(postorder, 0, i);
				int[] postRight = Arrays.copyOfRange(postorder, i, postorder.length - 1);

				root.left = buildTree(inLeft, postLeft);
				root.right = buildTree(inRight, postRight);
				break;
			}
		}
		return root;
	}
}
