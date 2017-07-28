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
	TreeNode* sortedArrayToBST(vector<int>& nums) {
		
		int size = nums.size();
		
		if (size == 0) {
			return NULL;
		}
		
		int middle = size / 2;
		
		TreeNode* root = new TreeNode(nums[middle]);
		
		vector<int> leftArray = vector<int>(nums.begin(), nums.begin()+middle);
		vector<int> rightArray = vector<int>(nums.begin()+middle+1, nums.end());
		
		root->left = sortedArrayToBST(leftArray);
		root->right = sortedArrayToBST(rightArray);
		
		return root;
	}
};
