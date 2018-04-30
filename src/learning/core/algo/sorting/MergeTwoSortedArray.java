package learning.core.algo.sorting;

import java.util.Scanner;

/*
Merging two sorted arrays
Description
Write a function that merges two sorted arrays in descending order, 
where the number of the elements is between 1 and 100,000 (0 < array size <= 100000). 
This code will take the following inputs in the sequence mentioned here:

    The size of the first sorted array.
    The size of the second sorted array.
    Elements of the first sorted array.
    Elements of the second sorted array.

Sample Input: 

3 
4 
1 
2 
3 
4 
5 
6 
7 

Output:

7
6
5
4
3
2
1
 */

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int sizeArray1 = scanner.nextInt();
	    int sizeArray2 = scanner.nextInt();
	    int sortedArray1[] = getArrayInput(sizeArray1, scanner);
	    int sortedArray2[] = getArrayInput(sizeArray2, scanner);

	    int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
	    for (int i : descendingMerge) {
			System.out.println(i);
		}
	}
	

	public static int[] getArrayInput(int sizeArray12, Scanner scanner2) {
		// TODO Auto-generated method stub
		int[] array = new int[sizeArray12];
		for(int i = 0; i < sizeArray12; i++) {
			array[i] = scanner2.nextInt();
		}
		return array;
	}

	public static int[] mergeBothInDescendingOrder(int[] sortedArray12, int[] sortedArray22) {
		int[] array = new int[sortedArray12.length + sortedArray22.length];
		int i = sortedArray12.length-1, j = sortedArray22.length-1, k = 0;
			
		while(i >= 0 && j >= 0) {
			array[k++] = sortedArray12[i] > sortedArray22[j] ? sortedArray12[i--] : sortedArray22[j--];
		}
		while( i >= 0) {
			array[k++] = sortedArray12[i--];
		}
		while( j >= 0) {
			array[k++] = sortedArray22[j--]; 
		}
		
		/*while( i < sortedArray12.length && j < sortedArray22.length) {
			//array[k++] = sortedArray12[i] > sortedArray22[j] ? sortedArray12[i++] : sortedArray22[j++];
			if(sortedArray12[i] > sortedArray22[j]) {
				
			}else{
				
			}
		}
		while( i < sortedArray12.length) {
			array[k++] = sortedArray12[i++];
		}
		while( j < sortedArray22.length) {
			array[k++] = sortedArray22[j++]; 
		}*/
		
		return array;
	}
	public static int[] mergeBothInAscendingOrder(int[] sortedArray12, int[] sortedArray22) {
		int[] array = new int[sortedArray12.length + sortedArray22.length];
		int i,j,k;
		i=j=k=0;
		while( i < sortedArray12.length && j < sortedArray22.length) {
			array[k++] = sortedArray12[i] < sortedArray22[j] ? sortedArray12[i++] : sortedArray22[j++]; 
		}
		while( i < sortedArray12.length) {
			array[k++] = sortedArray12[i++];
		}
		while( j < sortedArray22.length) {
			array[k++] = sortedArray22[j++]; 
		}
		
		return array;
	}
}
