class P112 {
	
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
		
		boolean sum = hasPathSum(root, 3);
		System.out.println(sum);
	}
	
	public static boolean hasPathSum(TreeNode root, int sum) {

		if (root == null) {
			return false;
		}
		
		if (root.left == null && root.right == null && root.val == sum) {
			return true;
		}
		
		if (root.left != null && hasPathSum(root.left, sum - root.val)) {
			return true;
		}
		
		if (root.right != null && hasPathSum(root.right, sum - root.val)) {
			return true;
		}
		
		return false;
	}
}
