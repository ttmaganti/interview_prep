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
}
