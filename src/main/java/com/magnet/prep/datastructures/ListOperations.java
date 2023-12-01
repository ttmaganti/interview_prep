package com.magnet.prep.datastructures;

public class ListOperations {
	public void printList(ListNode head) {
		if(head != null) {
			System.out.println(head.val);
			printList(head.next);
		}
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		
		while(current != null) {
			ListNode nextTemp = current.next;
			current.next = prev;
			prev = current;
			current = nextTemp;
		}
		return prev;
	}
	
	// Time complexity O(n). Space Complexity O(1)
	public ListNode removeNode(ListNode head, int n) {
		ListNode left = head;
		ListNode right = head;
		
		for(int i=0;i<n;i++) {
			if(right.next != null)
				right = right.next;
		}
		
		while(right.next != null) {
			right = right.next;
			left = left.next;
		}
		
		if(left.next != null && left.next.next != null)
			left.next = left.next.next;
		
		return head;
	}
}
