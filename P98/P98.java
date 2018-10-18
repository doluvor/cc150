// Validate Binary Search Tree

class P98 {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(2147483647);
		TreeNode level1_1 = new TreeNode(1);
		TreeNode level1_2 = new TreeNode(3);
//		TreeNode level2_1 = new TreeNode(4);
//		TreeNode level3_1 = new TreeNode(1);
//		root.left = level1_1;
//		root.right = level1_2;
//		level1_1.left = level2_1;
//		level1_2.left = level3_1;
		
		System.out.println(isValidBST(root));
	}
	
	public static boolean isValidBST(TreeNode root) {
		
		if (root == null) {
			return true;
		}
				
		return dfsValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);		
	}
	
	private static boolean dfsValidBST(TreeNode node, long max, long min) {

		if (node.val >= max || node.val <= min) {
			return false;
		}

		if (node.left != null && node.val <= node.left.val) {
			return false;
		} else if (node.right != null && node.val >= node.right.val) {
			return false;
		}
		
		boolean result = true;
		
		if (node.left != null) {
			
			boolean leftResult = dfsValidBST(node.left, node.val, min);
			
			result = result && leftResult;
		}
		
		if (node.right != null) {
			
			boolean rightResult = dfsValidBST(node.right, max, node.val);
			
			result = result && rightResult;
		}
		
		return result;
	}
}