package Sorting;

import java.util.Arrays;

public class LexicographicalSort {
    static void main() {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        lexicographicalSort(fruits);
        System.out.println(Arrays.toString(fruits));
    }
    static void lexicographicalSort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
