package BinarySearch;
import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = search(nums, target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int idx = findMinIndex(nums);
        if (idx == 0)
            return binarySearch(nums, target, 0, nums.length - 1);
        int left = binarySearch(nums, target, 0, idx - 1);
        if (left != -1) return left;
        return binarySearch(nums, target, idx, nums.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    static int findMinIndex(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + ((end - start) >>> 1);
            if(arr[mid] > arr[n - 1]){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}