package Sorting;

import java.util.Arrays;

public class SwappedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        // any two elements are swapped in a sorted array [no duplicates], find sorted array in linear time
        sortArray(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    static void sortArray(int[] arr){
        if(arr.length == 1 || arr.length == 0){ // handling corner cases
            return;
        }
        int x = -1, y = -1;
        int n = arr.length;
        // process all the adjacent elements
        for(int i = 1; i < n; i++){
            if(arr[i - 1] > arr[i]){
                if(x == -1){ // first conflict
                    x = i - 1;
                    y = i;
                }
                else{ // second conflict
                    y = i;
                }
            }
        }

        // swap x, y in arr
        if (x != -1 && y != -1) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}
