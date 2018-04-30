package learning.core.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Description
You are given an integer n in the first line of the input. In the next line you have to scan n space separated integers 
and store them in a linked list. Remember you cannot use the LinkedList java class and its methods, 
you have to make your own Linkedlist class and methods. 
Now you have to move the last element of the list in the front and then print the modified list
with the elements space separated in a single line.

Hint: Maintain two pointers in the list, one for the last element and the other to keep a track of its previous node.

Sample test case:

Input:

5
7 5 45 7 4

Output:

4 7 5 45 7

Explanation: 4 becomes the first element and all other elements are pushed back in the list by one place.
 */

class Linkedlist{
	Node head;
	public void moveLastElementToHead()
	{
		if(head == null || head.next == null) 
            return;
		Node secLast = null;
        Node last = head;
        while (last.next != null)  
        {
           secLast = last;
           last = last.next; 
        }
        secLast.next = null;
        last.next = head;
        head = last;
	}
	public void push(int data)
   	 {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null) {
	           head = newNode;
	       }else {
			while (temp.next != null)
		    {
		       temp = temp.next;
		    }
			temp.next = newNode;
	   	 }
   	 }
	public void printList()
   	{
		Node temp = head;
        while(temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        } 

//		while(temp.next != null)
//        {
//           System.out.print(temp.data+" ");
//           temp = temp.next;
//        }  
        System.out.println();
   	}
class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d) 
		{
			this.data = d; 
			this.next = null;
			this.prev = null;
		}
	}
}


public class LinkedListExample {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 int n = Integer.parseInt(br.readLine());
         String input = br.readLine();
         String[] strArray = input.split(" ");
         Linkedlist ll = new Linkedlist();
         
         for(int i=0; i< n ; i++){
        	 ll.push(Integer.parseInt(strArray[i]));
         }
         
         //ll.printList();
         ll.moveLastElementToHead();
         ll.printList();
       //  ll.
    }
}
