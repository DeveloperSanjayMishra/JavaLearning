package learning.core.algo.sorting;

import java.util.Arrays;

public class QuickSort {
    int p = 0;
    int q = 0;
    public void sort(Integer[] data) {
        System.out.println("Non Sorted : " + Arrays.toString(data));
        quicksort(data, 0, data.length-1);
    }
   
    public void quicksort(Integer[] data, int start, int end) {
        p++;
        if (start < end) {
            q++;
            int pivotIndex = partition(data, start, end);
            System.out.println(p +" " + q + " pivotIndex " + pivotIndex + " After Partition : " + Arrays.toString(data));
            quicksort(data, start, pivotIndex-1);
            System.out.println(p +" " + q  + " pivotIndex " + pivotIndex + " After Left : " + Arrays.toString(data));
            quicksort(data, pivotIndex+1, end);
            System.out.println(p +" " + q  + " pivotIndex " + pivotIndex + " After Right : " + Arrays.toString(data));
        }
    }
   
    private int partition(Integer[] data, int start, int end) {
        int pivot = data[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (data[j] > pivot) {
                int tmp = data[i];
                System.out.println(" i " + i + " j " + j + " data i " + data[i] + " data j " + data[j] + " data end " + data[end]);
                data[i] = data[j];
                data[j] = tmp;
                i++;
            }
        }
        System.out.println(Arrays.toString(data));
        System.out.println("end " + end + " i " + i);
        data[end] = data[i];
        data[i] = pivot;
        System.out.println(Arrays.toString(data));
        return i;
    }
   
    public static void main(String[] args) {
        Integer[] data = {25,5,7,2,19,23,12,18};
        new QuickSort().sort(data);
        System.out.println("Sorted Array " + Arrays.toString(data));
    }
}
