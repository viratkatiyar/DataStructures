package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[(arr.length - 1) - i];
//            arr[(arr.length - 1) - i] = temp;
//        }
//        return arr;
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            // swap without temp variable
            arr[i] = arr[i] + arr[j]; // a = a + b
            arr[j] = arr[i] - arr[j]; // b = a - b   // b = a
            arr[i] = arr[i++] - arr[j--]; // a = a - b   // a = b
        }
        return arr;
    }
}
