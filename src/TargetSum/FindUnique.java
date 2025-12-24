package TargetSum;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {
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
        System.out.println("Unique Number : " + uniqueNum(myArray));
    }
    static int uniqueNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int k : arr){
            if(k > 0){
                ans = k;
            }
        }
        return ans;
    }
}
