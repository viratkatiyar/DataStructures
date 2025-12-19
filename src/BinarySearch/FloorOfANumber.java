package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        // floor is the greatest number less than the target
        int[] arr = {-18, -12, -4, 0, 2, 3, 15, 16, 22, 45};
        int target = 17;
        System.out.println(floor(arr, target));
    }
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start]) {
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
        return end;
    }
}
