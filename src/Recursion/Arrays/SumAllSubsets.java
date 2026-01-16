package Recursion.Arrays;

import java.util.Scanner;

public class SumAllSubsets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        sumAllSubsets(arr, 0, 0);
    }
    static void sumAllSubsets(int[] arr,int sum, int idx){
        if(idx >= arr.length){
            System.out.println(sum);
            return;
        }

        // curr idx + sum
        sumAllSubsets(arr,sum + arr[idx], idx + 1);

        // curr ans
        sumAllSubsets(arr, sum, idx + 1);
    }
}
