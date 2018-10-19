// Construct Binary Tree from Inorder and Postorder Traversal

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class P106 {
	public static class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) { val = x; }
		}
		
		public static void main(String[] args) {

			int postorder[] = {9,15,7,20,3};
			int inorder[] = {9,3,15,20,7};
			
			TreeNode tree = buildTree(inorder, postorder);
			
			System.out.println(tree.right.left.val);
		}

		public static TreeNode buildTree(int[] inorder, int[] postorder) {

			if (inorder.length == 0) {
				return null;
			}

			int index = 0;
			
			int postorderLength = postorder.length;
			
			for (; index < inorder.length; index++) {
				if (inorder[index] == postorder[postorderLength - 1]) {
					break;
				}
			}
			
			if (index == inorder.length) {
				return null;
			}

			TreeNode node = new TreeNode(postorder[postorderLength - 1]);

			if (index > 0) {
						
				int subInorder[] = Arrays.copyOfRange(inorder, 0, index);
				int subPostorder[] = Arrays.copyOfRange(postorder, 0, index);

				TreeNode leftNode = buildTree(subInorder, subPostorder);
				node.left = leftNode;
			}
					
			if (index < inorder.length - 1) {
						
				int subInorder[] = Arrays.copyOfRange(inorder, index + 1, inorder.length);
				int subPostorder[] = Arrays.copyOfRange(postorder, index, postorderLength - 1);

				TreeNode rightNode = buildTree(subInorder, subPostorder);
				node.right = rightNode;
			}
					
			return node;
		}
}