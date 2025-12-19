package ArraysAndArrayLists;
import java.util.Arrays;
import java.util.Scanner;

public class SubArraysOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Sub Arrays Of Given Array : ");
        printSubArrays(arr);
    }
    public static void printSubArrays(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
