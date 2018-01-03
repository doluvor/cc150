/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class ListNode {
 		int val;
 	ListNode next;
 	ListNode(int x) {
 		val = x;
    	next = null;
    }
}

class P141 {

	public static void main(String[] args) {

		ListNode head1 = new ListNode(1);
		boolean result1 = true;

		if (hasCycle(head1) == result1) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node2;

		boolean result2 = true;

		if (hasCycle(node1) == result2) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}

	public static boolean hasCycle(ListNode head) {
		
		if (head == null) {
			return false;
		}
		
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast.next != null && fast.next.next != null && slow.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if (fast == slow) {
				return true;
			}
		}
		
		return false;
	}
}
