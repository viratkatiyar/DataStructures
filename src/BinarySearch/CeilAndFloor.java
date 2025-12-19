package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Number to find its ceil and floor : ");
        int num = scan.nextInt();

        int l = 0;
        int h = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(num < arr[m]){
                h = m - 1;
                ceil = arr[m];
            } else if(num > arr[m]){
                l = m + 1;
                floor = arr[m];
            } else{
                ceil = arr[m];
                floor = arr[m];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
