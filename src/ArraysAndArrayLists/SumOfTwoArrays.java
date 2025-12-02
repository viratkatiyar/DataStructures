package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Enter size(n1) of array 1 : ");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter Elements of Array 1 : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter size(n2) of array 2 : ");
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter Elements of Array 2 : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        int n3 = Math.max(n1, n2);
        int[] sum = new int[n3];
        int carry = 0;
        int k = n3 - 1;
        int i = n1 - 1;
        int j = n2 - 1;
        while(k >= 0){
            int d = carry;
            if(i >= 0){
                d += arr1[i];
            }
            if(j >= 0){
                d += arr2[j];
            }
            carry = d / 10;
            d = d % 10;
            sum[k] = d;
            k--;
            j--;
            i--;
        }
        if(carry != 0){
            System.out.println("Carry : " + carry);
        }
        System.out.println(Arrays.toString(sum));
    }
}
