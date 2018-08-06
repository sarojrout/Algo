/**
 * 
 */
package com.demo.misc;

import java.util.HashSet;
import java.util.Set;

/**
 * @author srout
 *
 */
public class RemoveDupElemFromLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(5);
		Node d = new Node(4);
		Node e = new Node(3);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		printList(a);
		removeDupUsingHash(a);
		
		System.out.println("after removing duplicates\n");
		
		printList(a);
	}
	public static void printList(Node head) {
		//Node current = this;
		while(head != null) {
			System.out.println(head.data+"->");
			head = head.next;
		}
		System.out.println("");
	}
	private static void removeDup(Node head) {
		Node prev = head;
		Node current = null;
		while(prev != null && prev.next != null) {
			current = prev;
			while(current != null && current.next != null) {
				if(prev.data == current.next.data) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}
			prev = prev.next;
		}
	}
	
	private static Node removeDupUsingHash(Node head) {
		Set<Integer> mySet = new HashSet<Integer>();
		Node current = head;
		mySet.add(current.data);
		while(current.next != null) {
			if(!mySet.contains(current.next.data)) {				
				mySet.add(current.next.data);
				current = current.next;
			} else {
				current.next=current.next.next;
			}
			
		}
		return head;
	}
	
	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}

}
