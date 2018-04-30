package learning.core.algo.sorting;

import java.util.Arrays;

/**
Write  Java code for bubble sort. Print the sorted array elements space separated in a single line using Arrays.toString

Sample test case:
Input:
No input required
Output:

[0, 1, 5, 13, 23, 32, 123, 352, 2351, 3242, 3915]
 *
 */
public class BubbleSorting {
	
	public static int[] sortArray(int[] input) {
		for(int i=0; i < input.length; i++) {
			for(int j=1; j<input.length-i; j++) {
				if(input[j-1] > input[j]) {
					swapArray(j-1, j, input);
				}
			}
		}
		
		return input;
	}
	
	private static void swapArray(int pos1, int pos2, int[] array) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

	public static void main(String[] args) {
		int[] randomNumber = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
		int [] sortedNumber = sortArray(randomNumber);
		System.out.println(Arrays.toString(sortedNumber));
	}

}
