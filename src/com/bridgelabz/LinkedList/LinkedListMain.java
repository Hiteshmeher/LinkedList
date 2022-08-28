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
		list.add(56); 				// Adding 56
		list.add(70); 				// Adding 70 now 56 -> 70
		list.insertInBetween(30); 	// Inserting 30 in between 56 and 70  
		list.display(); 			// Printing the Final List = 56 -> 30 -> 70
	}
}