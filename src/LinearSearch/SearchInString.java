package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        System.out.println("Enter String  : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Enter Character to find in string : ");
        char find = scan.next().charAt(0);
        System.out.println("Entered String : " + name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("Entered Character : " + find);
        System.out.println(searchString(name, find));
    }
    static boolean searchString(String name, char find){
        if(name.isEmpty()){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(find == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean searchString2(String name, char find){
        if(name.isEmpty()){
            return false;
        }
        for(char ch : name.toCharArray()){
            if(ch == find){
                return true;
            }
        }
        return false;
    }
}
