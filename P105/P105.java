// Construct Binary Tree from Preorder and Inorder Traversal

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class P105 {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {

		int preorder[] = {3,9,20,15,7};
		int inorder[] = {9,3,15,20,7};
		
		TreeNode tree = buildTree(preorder, inorder);
		
		System.out.println(tree.right.left.val);
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		if (inorder.length == 0) {
			return null;
		}

		int index = 0;
		
		for (; index < inorder.length; index++) {
			if (inorder[index] == preorder[0]) {
				break;
			}
		}
				
		if (index == inorder.length) {
			return null;
		}
				
		TreeNode node = new TreeNode(preorder[0]);
				
		if (index > 0) {
					
			int subInorder[] = Arrays.copyOfRange(inorder, 0, index);
			int subPreorder[] = Arrays.copyOfRange(preorder, 1, 1 + index);

			TreeNode leftNode = buildTree(subPreorder, subInorder);
			node.left = leftNode;
		}
				
		if (index < inorder.length - 1) {
					
			int subInorder[] = Arrays.copyOfRange(inorder, index + 1, inorder.length);
			int subPreorder[] = Arrays.copyOfRange(preorder, index + 1, preorder.length);

			TreeNode rightNode = buildTree(subPreorder, subInorder);
			node.right = rightNode;
		}
				
		return node;
	}
}