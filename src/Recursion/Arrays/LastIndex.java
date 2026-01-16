package Recursion.Arrays;

import java.util.Scanner;

public class LastIndex {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter target : ");
        int target = scan.nextInt();
        System.out.println("Last Index : " + lastIndex(arr, 0, target));
        scan.close();
    }
    static int lastIndex(int[] arr, int idx, int target){
        if(idx == arr.length) return -1;
        int ans = -1;
        if(arr[idx] == target) {
            ans = idx;
        }
        int smallAns = lastIndex(arr, idx + 1, target);
        if(smallAns == -1) return ans;
        return smallAns;
    }
}
