package xiang_135;

import java.util.ArrayList;
import java.util.LinkedList;

public class E08ExpressionTree {

	static class TreeNode {
		public String val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(String val) {
			this.val = val;
		}

		public TreeNode(TreeNode left, String val, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			return String.valueOf(this.val);
		}
	}

	public TreeNode constructExpressionTree(String[] tokens) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		for (String t : tokens) {
			switch (t) {
			case "+", "-", "*", "/" -> {
				TreeNode right = stack.pop();
				TreeNode left = stack.pop();
				TreeNode parent = new TreeNode(t);
				parent.left = left;
				parent.right = right;
				stack.push(parent);
			}
			default -> {
				stack.push(new TreeNode(t));
			}
			}
		}
		return stack.peek();
	}

	private void post(E08ExpressionTree.TreeNode node, ArrayList<String> result) {
		if (node == null) {
			return;
		}
		post(node.left, result);
		post(node.right, result);
		result.add(node.val);
	}

	public static void main(String[] args) {
		E08ExpressionTree e08 = new E08ExpressionTree();
		String[] tokens = { "2", "1", "-", "3", "*" };
		E08ExpressionTree.TreeNode root = e08.constructExpressionTree(tokens);
		ArrayList<String> result = new ArrayList<String>();
		e08.post(root, result);
		for (String string : result) {
			System.out.println(string);
		}
	}
}
