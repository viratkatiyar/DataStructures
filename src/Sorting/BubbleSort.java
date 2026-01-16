package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {5, 1, 2, 4, 3, 6, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {// i = 0 to i = n - 2 , because n - 1 loop break
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    // swap -- arr[j] , arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }
}
