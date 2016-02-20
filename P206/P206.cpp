tion for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
    
        if (head == NULL) {
            return head;
        }
    
        ListNode *last = NULL;
        ListNode *current = head;
        ListNode *next = current->next;
        
        while (current != NULL) {
            
            next = current->next;
            current->next = last;
            last = current;
            current = next;
        }
        
        return last;
    }
};
