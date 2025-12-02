package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Enter size(n1) of array 1 : ");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter Elements of Array 1 : ");
        for (int i = 0; i < n1; i++) {
            a1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(a1));
        System.out.println("Enter size(n2) of array 2 : ");
        int n2 = scan.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter Elements of Array 2 : ");
        for (int i = 0; i < n2; i++) {
            a2[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(a2));
        int[] diff = new int[n2];
        int c = 0;
        int k = n2 - 1;
        int i = n1 - 1;
        int j = n2 - 1;
        while(k >= 0){
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if(a2[j] + c >= a1v){
               d = a2[j] + c - a1v;
               c = 0;
            }
            else{
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;
            i --;
            j --;
            k --;
        }
        System.out.println(Arrays.toString(diff));

        // removing zero values from indexes
        int index = 0;
        while(index < diff.length){
            if(diff[index] == 0){
                index ++;
            }
            else{
                break;
            }
        }

        // printing result array non zero values
        while(index < diff.length){
            System.out.println(diff[index]);
            index ++;
        }
    }
}
