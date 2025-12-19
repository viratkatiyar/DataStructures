package BinarySearch;

import java.util.Arrays;

public class LeetCode3668 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int[] friends = {1, 3, 4};
        System.out.println(Arrays.toString(recoverOrder(arr, friends)));
    }
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int l = 0;
        for (int j : order) {
            int start = 0;
            int end = friends.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (j > friends[mid]) {
                    start = mid + 1;
                } else if (j < friends[mid]) {
                    end = mid - 1;
                } else {
                    ans[l++] = j;
                }
            }
        }
        return ans;
    }
}
