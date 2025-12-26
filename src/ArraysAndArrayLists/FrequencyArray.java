package ArraysAndArrayLists;

import java.util.Scanner;

public class FrequencyArray {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of input array (n) : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] freq = freqArray(arr);
        System.out.println("Enter no. of queries : ");
        int q = scan.nextInt();

        while(q > 0){
            System.out.println("Enter Number to check its Presence : ");
            int num = scan.nextInt();
            if(freq[num] > 0){
                System.out.println("Number is Present");
            }
            else{
                System.out.println("Not Present");
            }
            q--;
        }
    }
    static int[] freqArray(int[] arr){
        int[] freq = new int[100005];// some extra size no impact
        for (int j : arr) {
            freq[j]++;
        }
        return freq;
    }
}
