package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    // in place rotation
    public static void main(String[] args) {
        System.out.println("Enter size(n) of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter No. of rotations : ");
        int k = scan.nextInt();
        k %= arr.length;
        if(k < 0){
            k += arr.length;
        }
        System.out.printf("Rotated Array by %d places : ", k);
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] a, int i, int j){
        while(i < j){
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i++] - a[j--];
        }
    }
    public static void rotate(int[] a, int k){
        reverse(a, 0, a.length - k - 1); // part 1 reverse
        reverse(a, a.length - k, a.length - 1); // part 2 reverse
        reverse(a, 0, a.length - 1);
    }
}
