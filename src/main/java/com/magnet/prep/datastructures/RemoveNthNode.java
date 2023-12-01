package com.magnet.prep.datastructures;

public class RemoveNthNode {
	
	public static void main(String args[]) {
		ListNode head = new ListNode(23);
		head.next = new ListNode(89);
		head.next.next = new ListNode(10);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(67);
		head.next.next.next.next.next = new ListNode(39);
		head.next.next.next.next.next.next = new ListNode(70);
		head.next.next.next.next.next.next.next = new ListNode(28);
		
		ListOperations listOperations = new ListOperations();
		System.out.println("Before : ");
		listOperations.printList(head);
		
		listOperations.removeNode(head, 4);
		System.out.println("After : ");
		listOperations.printList(head);
	}

}
