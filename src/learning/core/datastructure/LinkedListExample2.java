package learning.core.datastructure;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 Description
Finding the duplicate strings in a linked list. 
You are given a linked list with some elements and you have to write a function to list all the strings occuring more than once. 
But each such string should be printed only once, irrespective of the number of times it occurs in the linked list.
Sample Input: 
No input required
Expected Output:  

hello
world
to you
 */

public class LinkedListExample2 {
	 
	public static void main(String args[]) {
		    LinkedList<String> myStrings = new LinkedList<String>();
		    myStrings.add("hello");
		    myStrings.add("world");
		    myStrings.add("to you");
		    myStrings.add("friend");
		    myStrings.add("hello");
		    myStrings.add("world");
		    myStrings.add("to you");
		    myStrings.add("too");
		    
		    Set<String> s = new HashSet<>();
		    
		  }
	    
}
