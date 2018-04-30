package learning.core.algo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Description
Write a program in Java that takes an array of strings as input and returns the sorted array. 
Use the quick sort algorithm for the program. Assume that the sorting needs to be done based on the size of each string. 
So, a string with fewer characters should come before another string with more number of characters. 
Also, in case of strings having the same size, it is NOT to be sorted in alphabetical order. 
As quick sort is not a stable sorting algorithm, the order of the input strings passed also need  be maintained in that case. 
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

public class QuickSortString {

	public static String[] sort(String[] data) {
		if (data == null || data.length == 0) {
            return data;
        }
        quickSort(data, 0, data.length - 1);
        return data;
    }
	public static void quickSort(String array[], int lowerIndex, int higherIndex) {
		int i = lowerIndex;
        int j = higherIndex;
        String pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
	    
        while(i < j) { // To preserve order compare only with i < j instead of i<=j
        	while (array[i].length() < pivot.length()) {
                i++;
            }
        	while (array[j].length() > pivot.length()) {
                j--;
            }
        	
        	if (i <= j) {
                exchangeNames(array, i, j);
                i++;
                j--;
            }
        	
        	//call quickSort recursively
            if (lowerIndex < j) {
                quickSort(array, lowerIndex, j);
            }
            if (i < higherIndex) {
                quickSort(array, i, higherIndex);
            }
        }
        
	   }
	public static void exchangeNames(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 	int n = Integer.parseInt(br.readLine());
   	 	String[] str = new String[n];
   	 	for(int i = 0; i < n; i++) {
   	 		str[i] = br.readLine();
   	 	}
   	 sort(str);
   	 for(int i = 0; i < n; i++) {
	 		System.out.println(str[i]);
	 	}
	 	
	 
	}
}
