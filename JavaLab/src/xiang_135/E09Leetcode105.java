package xiang_135;

import java.util.Arrays;

import xiang_129.TreeNode;

/*
 * 根據前序中序邊勵結果構造二叉樹
 */
public class E09Leetcode105 {

	/*
	 * preOrder={1,2,4,3,6,7}; inOrder={4,2,1,6,3,7};
	 */

	public TreeNode buildTree(int[] preOrder, int[] inOrder) {
		if (preOrder.length == 0 || inOrder.length == 0) {
			return null;
		}
		// 創建根結點
		int rootvalue = preOrder[0];
		TreeNode root = new TreeNode(rootvalue);
		// 區分左右子樹
		for (int i = 0; i < inOrder.length; i++) {
			if (inOrder[i] == rootvalue) {
				// 0~i-1 左子樹
				// i+1~inorder.length-1 右子樹
				int[] inLeft = Arrays.copyOfRange(inOrder, 0, i); // 含尾不含頭 [4,2]
				int[] inRight = Arrays.copyOfRange(inOrder, i + 1, inOrder.length); // 含尾不含頭 [6,3,7]

				int[] preLeft = Arrays.copyOfRange(preOrder, 1, i + 1); // [2,4]
				int[] preRight = Arrays.copyOfRange(preOrder, i + 1, preOrder.length);// [3,6,7]

				root.left = buildTree(preLeft, inLeft); // 2
				root.right = buildTree(preRight, inRight); // 3
				break;
			}
		}
		return root;
	}
}
