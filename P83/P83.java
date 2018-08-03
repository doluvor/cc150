class P83 {
	
	public class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		
		ListNode index = head;
		
		while (index != null && index.next != null) {
			
			if (index.next.val == index.val) {
				
				index.next = index.next.next;
			} else {
				index = index.next;
			}
		}
		
		return head;
	}
}
