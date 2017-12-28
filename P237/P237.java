/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class P237 {
	public static void main(String[] args) {
		
	}
	
	public void deleteNode(ListNode node) {
		
		node.val = node.next.val;
		node.next = node.next.next;
	}
}