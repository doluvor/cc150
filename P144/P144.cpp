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
    vector<int> preorderTraversal(TreeNode* root) {
        
        vector<int> result;
        
        addValue(root, result);
        
        return result;
    }
    
    void addValue(TreeNode *node, vector<int> &result) {
        
        if (node == NULL) {
            return;
        }
        
        result.push_back(node->val);
        
        addValue(node->left, result);
        addValue(node->right, result);
    }
};
