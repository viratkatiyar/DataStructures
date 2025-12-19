package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
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
        System.out.println("Enter element to found in the Array : ");
        int element = scan.nextInt();
        System.out.println(foundElement(arr, element));
    }
    public static int foundElement(int[] arr, int element){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
