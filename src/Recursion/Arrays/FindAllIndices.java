package Recursion.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndices {
    static void main(String[] args) {
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
        System.out.println(allIndices(arr, 0, target));
    }
    static ArrayList<Integer> allIndices(int[] arr, int idx, int target){
        // base case
        if(idx >= arr.length){
            return new ArrayList<>(); // empty arraylist
        }

        // self work
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == target){
            ans.add(idx);
        }

        // recursive work
        ArrayList<Integer> smallAns = allIndices(arr, idx + 1, target);

        ans.addAll(smallAns); // boolean return value
        return ans;
    }
}
