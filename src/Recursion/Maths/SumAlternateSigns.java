package Recursion.Maths;

import java.util.Scanner;

public class SumAlternateSigns {
    static void main() {
        System.out.println("Enter n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum : " + sumAlternateSigns(n));
    }
    static int sumAlternateSigns(int n){
        if(n == 0) return 0;
        return sumAlternateSigns(n - 1) + n * (n % 2 == 0 ? -1 : 1);
    }
}
