package ArraysAndArrayLists;

import java.util.Scanner;
import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of input array (n) : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Inverse Array : " + Arrays.toString(inverse(arr)));
    }
    public static int[] inverse(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            int val = arr[i];
            ans[val] = i;
        }
        return ans;
    }
}
