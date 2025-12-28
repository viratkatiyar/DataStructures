package PrefixSum;

import java.util.Scanner;

public class EqualSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of input array (n) : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int ts = 0;
        for(int k : arr){
            ts += k;
        }
        if (ts % 2 != 0) {
            System.out.println("No, Partition of array into two subarray with equal sum not possible");
            return;
        }
        int s = 0;
        for(int i = 0; i < n; i++){
            s += arr[i];
            if(s == ts / 2){
                System.out.println("Yes, We can partition the array into two subarray with equal sum");
                return;
            }
        }
        System.out.println("No, Partition of array into two subarray with equal sum not possible");
    }
}
