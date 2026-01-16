package Strings;
import java.util.Scanner;
public class PalindromeString {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Word to find if it is a PalindromeString : ");
        String str = scan.next();
        if(isPalindrome(str)){
            System.out.println("PalindromeString");
        }
        else{
            System.out.println("Not a PalindromeString");
        }
    }
    static boolean isPalindrome(String str){
        // approach using two pointers
        int s = 0;
        int e = str.length() - 1;
        while(s < e){
            if(str.charAt(s ++) != str.charAt(e --)) {
                return false;
            }
        }
        return true;
    }
}