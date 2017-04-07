/* Solution for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* root) {
        
        if (root == NULL) {
            return 0;
        } else if (root->left == NULL && root->right == NULL) {
            return 1;
        } else {
            
            int leftTreeDepth = 0;
            int rightTreeDepth = 0;
            
            if (root->left != NULL) {
                leftTreeDepth = maxDepth(root->left);
            }
            
            if (root->right != NULL) {
                rightTreeDepth = maxDepth(root->right);
            }
            
            return max(leftTreeDepth, rightTreeDepth) + 1;
        }
    }
};
