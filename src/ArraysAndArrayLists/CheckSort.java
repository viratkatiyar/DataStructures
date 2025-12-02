package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSort {
    public static void main(String[] args) {
        System.out.println("Enter size of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }
        if(checkSort(myArray)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
    static boolean checkSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}
