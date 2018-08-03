class P110 {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode level1_1 = new TreeNode(2);
		TreeNode level1_2 = new TreeNode(3);
		TreeNode level2_1 = new TreeNode(4);
		TreeNode level3_1 = new TreeNode(5);
		root.left = level1_1;
		root.right = level1_2;
		level1_1.left = level2_1;
		level1_2.right = level3_1;
		
		int depth = treeDepth(root);
		System.out.println(depth);
	}
	
	public static boolean isBalanced(TreeNode root) {
	
		if (treeDepth(root) == -1) {
			return false;
		}	
	
		return true;
	}
	
	public static int treeDepth(TreeNode node) {
		
		if (node == null) {
			return 0;
		}
		
		int leftDepth = treeDepth(node.left);
		int rightDepth = treeDepth(node.right);
		
		if (leftDepth == -1 || rightDepth == -1) {
			return -1;
		}
		
		if (Math.abs(leftDepth - rightDepth) <= 1) {
			return Math.max(leftDepth, rightDepth) + 1;
		} else {
			return -1;
		}
	}
}