// Binary Tree Paths

import java.util.List;
import java.util.ArrayList;

class P257 {
	
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
//		TreeNode level3_1 = new TreeNode(5);
		root.left = level1_1;
		root.right = level1_2;
		level1_1.left = level2_1;
//		level1_2.right = level3_1;
		
		List<String> paths = binaryTreePaths(root);
		System.out.println(paths);
	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
				
		List<String> paths = new ArrayList();

		dfs(root, paths, "");
				
		return paths;
	}
	
	private static void dfs(TreeNode node, List<String> paths, String path) {
		
		if (node == null) {
			return;
		}
		
		if (node.left == null && node.right == null) {
			
			if (path == "") {
				path += "" + node.val;
			} else {
				path += "->" + node.val;
			}
			
			paths.add(path);
			
			return;
		} else {
			
			if (path == "") {
				path += "" + node.val;
			} else {
				path += "->" + node.val;
			}
						
			dfs(node.left, paths, path);
			dfs(node.right, paths, path);
		}
	}
}