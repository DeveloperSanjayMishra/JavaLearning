package learning.core.algo.sorting;

import java.util.Scanner;

/*
Description
Write a program in Java that takes an array of strings as input and returns the sorted array. 
Use the quick sort algorithm for the program. Assume that the sorting needs to be done based on the size of each string. 
So, a string with fewer characters should come before another string with more number of characters. 
Also, in case of strings having the same size, it is NOT to be sorted in alphabetical order. 
As quick sort is not a stable sorting algorithm, the order of the input strings passed also need not be maintained in that case. 
Just implement the quick sort algorithm correctly based on size of strings to get the desired output. 
The code will take the size of the array and its elements as inputs.

Sample Input:

10
Christene
Tomas
Marline
Marcellus
Michele
Irmgard
Quiana
Dudley
Daisey
Kenyatta

Output:

Tomas
Quiana
Dudley
Daisey
Marline
Michele
Irmgard
Kenyatta
Christene
Marcellus

 */


public class QuickSortExample3 {
	   public static void quickSort(String array[], int left, int right) {
	       if (left < right) {
	           int position = partition(array, left, right);
	           quickSort(array, left, position - 1);
	           quickSort(array, position + 1, right);
	       }

	   }

	   public static int partition(String array[], int left, int right) {
	       String x = array[right];
	       int i = left - 1;
	       for (int j = left; j <= right - 1; j++) {
	           if (array[j].length() <= x.length()) {
	               i++;
	               String tmp = array[i];
	               array[i] = array[j];
	               array[j] = tmp;
	           }
	       }
	       // swap
	       String swap = array[i + 1];
	       array[i + 1] = array[right];
	       array[right] = swap;
	       return i + 1;
	   }

	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int size = scanner.nextInt();
	       String array[] = new String[size];
	       for (int i = 0; i < size; i++) {
	           array[i] = scanner.next();
	       }
	       // Sort in ascending order
	       quickSort(array, 0, array.length - 1);

	       for (String i : array) {
	           System.out.println(i);
	       }
	   }
}
