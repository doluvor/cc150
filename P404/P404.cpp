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
	int sumOfLeftLeaves(TreeNode* root) {
		
		if (root == NULL) {
			return 0;
		}
		
		int leftSum = 0;
		int rightSum = 0;
		
		if (root->left != NULL) {
			leftSum = sumOfLeftLeaves(root->left);
		}
		
		if (root->right != NULL) {
			rightSum = sumOfLeftLeaves(root->right);
		}
		
		int current = 0;
		
		if (root->left != NULL && root->left->left == NULL && root->left->right == NULL) {
			current = root->left->val;
		}
		
		return leftSum + rightSum + current;
	}
};