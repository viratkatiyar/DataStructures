package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        System.out.println("Enter size(n) of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements or Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
        System.out.println("Span of Array : " + (max - min));
    }
}
