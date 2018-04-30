package learning.core.algo.sorting;

import java.util.Arrays;

public class HeapSort {

	public static int[] sort ( int[] numbers){
		buildHeap(numbers);
		int sizeOfHeap = numbers.length -1;
        for(int i = sizeOfHeap; i > 0; i--) {
        	swap(numbers, 0, i);
        	sizeOfHeap = sizeOfHeap - 1; 
        	heapify(numbers, 0, sizeOfHeap);
        }
		
		return numbers;
    }
	public static void buildHeap(int[] numbers) {
		for(int i = (numbers.length-1)/2; i >=0; i--) {
			heapify(numbers, i, numbers.length-1);
		} 
	}
	public static void heapify(int [] numbers, int index, int size) {
		int left = 2 * index +1;
		int right = 2 * index +2;
		int max = index;
		if(left <= size && numbers[left] > numbers[max])
			max = left;
		if(right <= size && numbers[right] > numbers[max])
			max = right;
		if (max != index) {
			swap(numbers, index, max);
			heapify(numbers, max, size);
		}
	}
	public static int[] swap(int [] numbers, int indexOne, int indexTwo) {
		int temp = numbers[indexOne];
		numbers [indexOne] = numbers[indexTwo];
		numbers[indexTwo] = temp;
		return numbers;
	}
	public static void main(String args[]) {
	    int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
	    int[] sortedNumbers;
	    sortedNumbers = sort(randomNumbers);
	    System.out.println(Arrays.toString(sortedNumbers));
}
}
