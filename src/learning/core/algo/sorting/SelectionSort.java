package learning.core.algo.sorting;

import java.util.Arrays;

public class SelectionSort {
	
		public static int[] sortArray(int[] input) {
		for(int i=0; i < input.length - 1; i++) {
			int minIndex = i;
			for(int j = i +1; j < input.length; j++) {
				if(input[j] < input[minIndex]) {
					minIndex = j;
				}
				
			}
			int temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
		
		return input;
	}

	

   public static int[] sort(int[] numbers) {
       for (int i = 0; i < numbers.length - 1; i++) {
           // assume the ith element is the smallest element
           int minimumElement = i;

           // looping through the rest of the array to find a smaller element
           for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[j] < numbers[minimumElement]) {
                   minimumElement = j; // smaller element found
               }
           }
           // swap the smallest element found with the ith element
           swap(minimumElement, i, numbers);
       }
       return numbers;
   }

   public static void swap(int i, int j, int[] array) {
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
   }


 

	public static void main(String[] args) {
		int[] randomNumber = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
		int [] sortedNumber = sortArray(randomNumber);
		System.out.println(Arrays.toString(sortedNumber));
		sortedNumber = sort(randomNumber);
		System.out.println(Arrays.toString(sortedNumber));
	}
}
