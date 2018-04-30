package learning.core.algo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Subarray greater than pivot
Description
Write a quick sort variant that takes an array ‘A’ of integers and a random pivot as inputs, 
and returns the subarray that has all the elements greater than or equal to A[pivot].
This code will take three inputs:

    The first input will be the size of the array
    Next, the inputs will be for the elements inside the array as per the given size. Choose an integer array for convenience.
    The third input will be the index of the pivot element you want to choose

Note that you have to implement in-place quick sort and not use any extra space or declare another array. 
Also, the subarray to be returned can be in an unsorted order. 
This doesn't mean you can return the subarray elements in any order of your choice. 
You have to implement the correct algorithm for quick sort in-place sorting for the minimum required number of runs to get the output 
and once you do that, the order that you get will be the correct one. 
Do all the modifications and swaps within the input array. 
Use the copyOfRange function of arrays to return the required part (subarray) of the modified array

Sample Input:

10
10 20 47 86 15 35 37 76 56 25
2

Output:

47
76
56
86
 */

public class QuickSortExample4 {
	static Random random = new Random();
	 public static int[] getSubarrayGreaterThan(int pivot, int[] arr) {
		 if ((pivot >= arr.length) || (pivot < 0)) {
	           return null;
	       }
	       int smallerIndex = -1, temp;
	       temp = arr[arr.length - 1];
	       arr[arr.length - 1] = arr[pivot];
	       arr[pivot] = temp;
	       pivot = arr.length - 1;
	       for (int i = 0; i < (arr.length - 1); i++) {
	           if (arr[i] < arr[pivot]) {
	               smallerIndex++;
	               temp = arr[i];
	               arr[i] = arr[smallerIndex];
	               arr[smallerIndex] = temp;
	           }
	       }
	       temp = arr[arr.length - 1];
	       arr[arr.length - 1] = arr[smallerIndex + 1];
	       arr[smallerIndex + 1] = temp;
	       return Arrays.copyOfRange(arr, smallerIndex + 1, arr.length);
	 }




	 public static void main(String args[]) throws IOException {
	       Scanner sc = new Scanner(System.in);
	       int length = sc.nextInt();
	       int arr[] = new int[length];
	       for (int i = 0; i < length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       int pivot = sc.nextInt();
	       int newarr[] = getSubarrayGreaterThan(pivot, arr);
	       if(newarr!=null) {
	    	   for (int i : newarr) {
	               System.out.println(i);
	           } 
	       }
	 }
}
