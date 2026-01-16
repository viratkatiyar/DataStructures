package Sorting;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
       int[] arr = {0, 2, 1, 2, 0, 0};
       sort1(arr);
       System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    static void sort1(int[] arr){
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for(int k : arr){
            if(k == 0) count_0++;
            else if(k == 1) count_1++;
            else count_2++;
        }
        int k = 0;
        while(count_0 > 0){
            arr[k++] = 0;
            count_0--;
        }
        while(count_1 > 0){
            arr[k++] = 1;
            count_1--;
        }
        while(count_2 > 0){
            arr[k++] = 2;
            count_2--;
        }
    }
}
