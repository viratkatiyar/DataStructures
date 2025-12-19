package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

// best Time Complexity : O(1) , first element matches
// worst Time Complexity : O(n) , search till last element
public class FindElement {
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
        System.out.println(linearSearch(arr, element));
    }
    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
