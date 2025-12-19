package BinarySearch;

public class CeilOfANumber {
    public static void main(String[] args) {
        // Ceil of a number is the smallest number in array which is greater or equal to that number
        int[] arr = {-18, -12, -4, 0, 2, 3, 15, 16, 22, 45};
        int target = 17;
        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
