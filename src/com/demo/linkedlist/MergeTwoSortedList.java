package com.demo.linkedlist;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		
		Node head2 = new Node(4);
		head2.next = new Node(6);
		head2.next.next = new Node(8);
		Node result = mergeLists(head1, head2);
		printList(result);
	}
	
	private static Node mergeLists(Node a, Node b) {
		if(a == null) return b;
		if(b == null) return a;
		if(a.data < b.data) {
			a= mergeLists(a.next,b);
			return a;
		}else {
			b = mergeLists(b.next,a);
			return b;
		}
	}
	static Node head;
	
	private static void printList(Node head) {
		while(head != null) {
			System.out.println(head.next+"->");
		}
		System.out.println();
	}
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

}
