package com.demo.linkedlist;

public class DeletingNodeFromLinedList {

	public static void main(String[] args) {
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(5);
		Node d = new Node(7);
		a.next=b;
		b.next=c;
		c.next=d;
 DeletingNodeFromLinedList.deleteNodeFromList(a,5);
printList(a);
	}
	Node head;
	public static void printList(Node head) {
		while(head !=null) {
			System.out.println(head.next.data+"->");
			head = head.next;
		}
		System.out.println();
	}
	static void deleteNodeFromList(Node head, int d) {
		Node n = head;
		if(n.data == d) {
			head=head.next;
		}
		while(n.next !=null) {
			if(n.next.data == d) {
				n.next=n.next.next;
			//	return head;
			}
			n=n.next;
		}
		//return head;
	}
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next=null;
		}
	}

}
