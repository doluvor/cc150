/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:

	int maxDiameter = 0;

	int diameterOfBinaryTree(TreeNode* root) {
		
		depthOfSubTree(root);
		
		return maxDiameter;
	}
	
	int depthOfSubTree(TreeNode* node) {
		
		if (node == NULL) {
			return 0;
		}
		
		int leftDepth = depthOfSubTree(node->left);
		int rightDepth = depthOfSubTree(node->right);
		
		if (leftDepth + rightDepth > maxDiameter) {
			maxDiameter = leftDepth + rightDepth;
		}
		
		return max(leftDepth, rightDepth) + 1;
	}
};

