package BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        // This works only for ascending order sorted array
        int[] arr = {-18, -11, 7, 9, 70, 100, 221};
        int target = 9;
        System.out.println(recursiveBinarySearch(arr,0, arr.length - 1, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int recursiveBinarySearch(int[] arr, int start, int end, int target){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(target == arr[mid]) return mid;
        else if(target < arr[mid]){
            return recursiveBinarySearch(arr, start, mid - 1, target);
        }
        else{
            return recursiveBinarySearch(arr, mid + 1, end, target);
        }
    }
}
