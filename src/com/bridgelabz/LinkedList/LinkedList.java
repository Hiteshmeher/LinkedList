package com.bridgelabz.LinkedList;
/**
 * 
 * @author HITESH
 *
 */
public class LinkedList {

	Node head;
	Node tail;

	/**
	 * 
	 * @param data
	 */
	public void add(int data) {
		/**
		 * checking whether linked List is empty or not 
		 * if empty creating new node(adding)
		 */
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		/**
		 * displaying the data(s) from node(s)
		 */
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public void push(int data) {
		//Creating object of class Node
		Node newNode = new Node(data);
		// checking head is null or not
		if (head == null) {
			head = newNode; // if head is null, creating head = new node
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insertInBetween(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			 head = newNode;
			 tail = newNode;
		} else {
			head.next = newNode;
			newNode.next = tail;
		}
		
	}
}