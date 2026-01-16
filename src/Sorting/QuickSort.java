package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 13, 8, 5, 10, 2, 4};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for(int i = st + 1; i <= end; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pivotIndex = st + count; // why not count only because each time st is not 0
        swap(arr, st, pivotIndex);

        int i = st;
        int j = end;
        // elements lesser or equal than pivot in left side and greater in right side
        while(i < pivotIndex && j > pivotIndex){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i , j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }
}
