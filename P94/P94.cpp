tion for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        
        vector<int> results;
        
        addValue(root, results);
        
        return results;
    }
    
    void addValue(TreeNode *node, vector<int> &results) {
        
        if (node == NULL) {
            return;
        }
        
        addValue(node->left, results);
        results.push_back(node->val);
        addValue(node->right, results);
    }
};
