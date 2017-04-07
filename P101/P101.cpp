/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

#include <iostream>
#include <queue>

struct TreeNode {
	int val;
	TreeNode *left;
  	TreeNode *right;
  	TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};


class SolutionRecursive {
public:
	bool isSymmetric(TreeNode* root) {
	
		if (root == NULL) {
			return true;
		}	
		
		return isChildrenSymmetric(root->left, root->right);
	}
	
private:
	bool isChildrenSymmetric(TreeNode* node1, TreeNode* node2) {
		
		if (node1 == NULL && node2 == NULL) {
			return true;
		}
		
		if (node1 == NULL || node2 == NULL) {
			return false;
		}
		
		return isChildrenSymmetric(node1->left, node2->right)
				&& isChildrenSymmetric(node1->right, node2->left)
				&& node1->val == node2->val;
	}
};

class SolutionIterator {
public:
	bool isSymmetric(TreeNode* root) {
	
		std::queue<TreeNode*> queue = std::queue<TreeNode*>();

		if (root->left == NULL && root->right == NULL) {
			return true;
		}
		
		if (root->left == NULL || root->right == NULL) {
			return false;
		}
		
		queue.push(root->left);
		queue.push(root->right);
		
		while (queue.size() >= 2) {
			
			TreeNode* node1 = queue.front();
			queue.pop();
			TreeNode* node2 = queue.front();
			queue.pop();
			
			if (node1 == NULL && node2 == NULL) {
				continue;
			}
			
			if (node1 == NULL || node2 == NULL) {
				return false;
			}
			
			if (node1->val != node2->val) {
				return false;
			}
						
			queue.push(node1->left);
			queue.push(node2->right);
			queue.push(node1->right);
			queue.push(node2->left);			
		}
		
		return true;
	}
};

int main() {
	
	TreeNode* root = new TreeNode(5);
	
	TreeNode* left = new TreeNode(2);
	TreeNode* right = new TreeNode(2);
	
	root->left = left;
	root->right = right;
	
	SolutionIterator* solution = new SolutionIterator();
	std::cout << solution->isSymmetric(root) << std::endl;
	
	return 0;
}
