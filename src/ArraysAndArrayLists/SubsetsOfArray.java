package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetsOfArray {
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
        System.out.println("Subsets of Array : ");
        subsets(arr);
    }
    public static void subsets(int[] arr) {
        int n = arr.length;
        int limit = 1 << n; // 2^n subsets

        for (int mask = 0; mask < limit; mask++) {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }
}
