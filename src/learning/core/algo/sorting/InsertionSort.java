package learning.core.algo.sorting;

import java.util.Arrays;

/***
 * 
Insertion Sort
Description
Write code in java for insertion sort. Print the sorted array elements space separated in a single line using Arrays.toString

Sample test case:
Input:
No input required
Output:

[0, 1, 5, 13, 23, 32, 123, 352, 2351, 3242, 3915]
 */
public class InsertionSort {

	public static int[] sortArray(int[] input) {
		for(int i=0; i < input.length; i++) {
			int current = input[i];
			int j=i-1;
			while(j >= 0 && input[j] > current) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = current;
		}
		
		return input;
	}
	
/*

   public static int[] sort(int[] numbers) {
       for (int i = 1; i < numbers.length; i++) {
           for (int j = i; j > 0; j--) {
               if (numbers[j] < numbers[j - 1]) {
                   // if number at jth position is smaller
                   // than the number at jth - 1 position
                   // swap the numbers
                   swap(j, j - 1, numbers);
               }
           }
       }
       return numbers; // returning the final sorted array
   }

   public static void swap(int i, int j, int[] array) {
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
   }

 */

	public static void main(String[] args) {
		int[] randomNumber = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
		int [] sortedNumber = sortArray(randomNumber);
		System.out.println(Arrays.toString(sortedNumber));
	}
}
