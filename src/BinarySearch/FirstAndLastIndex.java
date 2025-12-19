package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter element to find its first and last index : ");
        int target = scan.nextInt();
        int first = -1;
        int last = -1;
        int l = 0;
        int h = arr.length - 1;

        // last index
        while(l <= h){
            int m = l + (h - l) / 2;
            if(target > arr[m]){
                l = m + 1;
            } else if(target < arr[m]){
                h = m - 1;
            } else{
                last = m;
                l = m + 1;
            }
        }

        l = 0;
        h = arr.length - 1;

        // first index
        while(l <= h){
            int m = l + (h - l) / 2;
            if(target > arr[m]){
                l = m + 1;
            } else if(target < arr[m]){
                h = m - 1;
            } else{
                first = m;
                h = m - 1;
            }
        }
        System.out.println("First and Last Index : " + first + ", " + last);
    }
}
