package com.bridgelabz.LinkedList;

/**
 * 
 * @author HITESH
 *
 */
public class LinkedListMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// creating Object of LinkedList Class
		LinkedList list = new LinkedList();
		list.add(56); 		// Adding 56
		list.append(30); 	// Append 30 to 56
		list.append(70); 	// Append 70 to 30
		list.display(); 	// Printing the Final List
	}
}