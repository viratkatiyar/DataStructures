package Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisorsOfANumber {
    static void main() {
        System.out.println("Enter Number to gets its divisor : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(divisorsList(n));
    }
    static ArrayList<Integer> divisorsList(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0){
                list.add(i);
                if(i != n / i){ // to avoid duplicates
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}
