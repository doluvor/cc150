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

class P21 {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(5);

		node1.next = node3;
		node3.next = node5;
		node2.next = node4;


		ListNode result = mergeTwoLists(node1, node2);

		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		System.out.println(result.next.next.next.val);

//		if (hasCycle(node1) == result2) {
//			System.out.println("Passed");
//		} else {
//			System.out.println("Failed");
//		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
				
		ListNode currentNode;
		ListNode headNode;
		
		if (l1 == null) {
			return l2;
		}
		
		if (l2 == null) {
			return l1;
		}
		
		if (l1.val <= l2.val) {
			headNode = l1;
			currentNode = l1;
			l1 = l1.next;
		} else {
			headNode = l2;
			currentNode = l2;
			l2 = l2.next;
		}
		
		while (l1 != null && l2 != null) {
			
			if (l1.val <= l2.val) {
				ListNode l1next = l1.next;
				currentNode.next = l1;
				l1 = l1next;
				currentNode = currentNode.next;
			} else {
				ListNode l2next = l2.next;
				currentNode.next = l2;
				l2 = l2next;
				currentNode = currentNode.next;
			}
		}
		
		if (l1 != null) {
			currentNode.next = l1;
		}
		
		if (l2 != null) {
			currentNode.next = l2;
		}
		
		return headNode;
	}
}
