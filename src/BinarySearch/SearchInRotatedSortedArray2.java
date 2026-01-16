package BinarySearch;

import java.util.Scanner;
// this code is to search in a rotated sorted array (no duplicates) in one pass
public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target to search : ");
        int target = sc.nextInt();
        System.out.println("Index of Target : " + search(nums, target));
    }
    static int search(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start) >>> 1);
            if(target == arr[mid]) return mid;
            else if(arr[mid] < arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}