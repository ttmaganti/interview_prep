package com.magnet.prep.datastructures;

public class ReverseLinkedList {
	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ListOperations listOperations = new ListOperations();
		
		System.out.println("Original List");
		listOperations.printList(head);
		
		ListNode reversedList = listOperations.reverseList(head);
		
		System.out.println("Reversed List");
		listOperations.printList(reversedList);
	}

}
