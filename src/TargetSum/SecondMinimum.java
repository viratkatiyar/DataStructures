package TargetSum;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinimum {
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
        int firstMin = findMin(myArray);

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == firstMin){
                myArray[i] = Integer.MAX_VALUE;
            }
        }
        System.out.println("Second Minimum : " + findMin(myArray));
    }
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int k : arr){
            if(k < min){
                min = k;
            }
        }
        return min;
    }
}
