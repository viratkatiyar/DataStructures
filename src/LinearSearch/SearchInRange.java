package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        System.out.println("Enter size of Array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter " + n + " elements of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter element to find in the Array : ");
        int element = scan.nextInt();
        System.out.println("Enter starting index : ");
        int start = scan.nextInt();
        System.out.println("Enter ending index : ");
        int end = scan.nextInt();
        System.out.println(linearSearch(arr, element, start, end));
    }
    static boolean linearSearch(int[] arr, int element, int start, int end){
        for (int i = start; i <= end; i++) {
            if(element == arr[i]){
                return true;
            }
        }
        return false;
    }
}