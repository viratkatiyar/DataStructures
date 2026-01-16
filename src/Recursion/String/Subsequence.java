package Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scan.nextLine(); // e.g., "abc"
        System.out.println(subSequences(s));
        subSequences2(s, "");
        scan.close();
    }
    static ArrayList<String> subSequences(String s){
        ArrayList<String> ans = new ArrayList<>(); // ans = []

        // base case
        if(s.isEmpty()){
            ans.add("");
            return ans;
        }

        ArrayList<String> smallAns = subSequences(s.substring(1)); // smallAns = ["bc", "b", "c", ""]

        for(String str : smallAns){
            ans.add(s.charAt(0) + str); // ans = ["abc", "ab", "ac", "a"]
        }

        ans.addAll(smallAns); // ans = ["abc", "ab", "ac", "a", "bc", "b", "c", ""]
        return ans;
    }
    static void subSequences2(String s, String currAns){
        if(s.isEmpty()){
            System.out.println(currAns);
            return;
        }
        char currChar = s.charAt(0);
        String rem = s.substring(1);
        subSequences2(rem, currAns + currChar); // choice 1
        subSequences2(rem, currAns); // choice 2
    }
}
