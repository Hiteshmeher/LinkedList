package com.bridgelabz.LinkedList;

/**
 * 
 * @author HITESH
 *
 */
public class Node {
	// initialize variables
	public int data;
	public Node next;

	// Constructors
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}