package Sorting;

import java.util.Arrays;

public class Move0sToEnd {
    static void main() {
        int[] arr = {0, 5, 0, 3, 4, 2};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroesToEnd(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] == 0 && arr[j + 1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
