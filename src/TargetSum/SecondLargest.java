package TargetSum;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
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
        int max = findMax(myArray);

        // second largest
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == max){
                myArray[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(myArray);
        System.out.println("Second Max Element : " + secondMax);
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int k : arr){
            if(k > max){
                max = k;
            }
        }
        return max;
    }
}
