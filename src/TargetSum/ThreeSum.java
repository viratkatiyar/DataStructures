package TargetSum;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    static void main() {
        System.out.println("Enter size of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Enter Target : ");
        int target = scan.nextInt();
        System.out.println("No. of Triplets : " + threeSum(myArray, target));
    }
    static int threeSum(int[] arr, int target){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
}
