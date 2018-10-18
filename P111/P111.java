// Minimum Depth of Binary Tree

class P111 {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode level1_1 = new TreeNode(2);
//		TreeNode level1_2 = new TreeNode(3);
//		TreeNode level2_1 = new TreeNode(4);
//		TreeNode level3_1 = new TreeNode(5);
		root.left = level1_1;
//		root.right = level1_2;
//		level1_1.left = level2_1;
//		level1_2.right = level3_1;
		
		int depth = minDepth(root);
		System.out.println(depth);
	}
	
	public static int minDepth(TreeNode root) {
		
		if (root == null) {
			return 0;
		}
		
		if (root.left == null && root.right == null) {
			return 1;
		}
		
		if (root.left == null) {
			return minDepth(root.right) + 1;
		}
		
		if (root.right == null) {
			return minDepth(root.left) + 1;
		}
		
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;		
	}
}
