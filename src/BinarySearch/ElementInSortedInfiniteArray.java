package BinarySearch;

import java.util.Scanner;

public class ElementInSortedInfiniteArray {
    public static void main(String[] args) {
        System.out.println("Enter size of infinite array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter target : ");
        int target = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        // let's take n --> infinite
        int start = 0;
        int end = 1;
        while (end < n && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        if (end >= n) {
            end = n - 1;
        }
        System.out.println("Index of target element : " + findElement(arr, start, end, target));
    }
    static int findElement(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
