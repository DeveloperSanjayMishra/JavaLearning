package learning.core.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Description
Given below is the code for ArrayList, which contains an ArrayList named "random" with six elements 
— 2, 4, 5, 10, 99.9, and 101 — stored as float-type values. 
The code prints all the elements using a ‘for’ loop. 
Modify this code to print all the elements backwards ‘iteratebwd()’ (starting from the last element of the list), 
using the ListIterator interface. 
Make another method ‘iterateAltn( )’, with a code that prints the elements stored at the even positions of ArrayList,
 i.e. print alternate elements, starting from index 1, again using the ListIterator interface.

Sample Input: 
No input required

Expected Output:  

101.0
99.9
10.0
5.0
4.0
2.0
4.0
10.0
101.0

 */

public class ArrayListExample {
	   public static void main(String[] args) {
	       List<Float> random = new ArrayList<Float>();
	       random.add(2f);
	       random.add(4f);
	       random.add(5f);
	       random.add(10f);
	       random.add(99.9f);
	       random.add(101f);

	       printList(random);
	       iterateAltn(random);
	   }

	   public static void printList(List<Float> arr) {
	      /* for(Float num : arr) {
	           System.out.println(num);
	       }
	       */
		   ListIterator<Float> li = arr.listIterator(arr.size());
		   
		   while(li.hasPrevious()) {
			   System.out.println(li.previous());
		   }
		   
	   }
	   
	   public static void iterateAltn(List<Float> arr) {
		   ListIterator<Float> li = arr.listIterator();
		   int i = 1;
		   while(li.hasNext()) {
			   if(i%2 == 0) {
				 System.out.println(li.next());
			   }else {
				   li.next();
			   }
			   i++;
		   }
	   }
}
