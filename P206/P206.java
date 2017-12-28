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

class P206 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode result = reverseList(head);
	}
	
	public static ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode preNode = null;

		while (head.next != null) {
					
			ListNode nextNode = head.next;
			head.next = preNode;
			head = nextNode;
		}
			
		head.next = preNode;

		return head;
	}
}