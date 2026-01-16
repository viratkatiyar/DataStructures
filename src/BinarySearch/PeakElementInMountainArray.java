package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class PeakElementInMountainArray {
    static void main() {
        // Mountain array : first elements in ascending order strictly and then in descending order strictly
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Mountain Array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Mountain Array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Peak Element in Mountain Array : " + findPeak(arr));
    }
    static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int m = s + (e - s) / 2;
            if(arr[m] > arr[m + 1]){
                // you are in decreasing part of array this may be ans
                // but look at left
                // this is why e != m - 1
                e = m;
            }
            else {
                // you are in ascending part of the array
                s = m + 1; // because we know that mid + 1 element > mid element
            }
            // in the end start == end and pointing to the largest number because of the 2 checks above
            // start and end are always trying to find max elment in the above two checks
            // hence , when they are pointing to just one element, this is the max one because that is the checks say
            // at every point of time for start and end, they have the best possible answer till that time
            // if we are saying only one item is remaining , hence cuz of above line that is the best possible answer
        }
        return s;
    }
}
