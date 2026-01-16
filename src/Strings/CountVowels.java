package Strings;

public class CountVowels {
    static void main() {
        String str = "virat is a very bad boy he is not a hardworking";
        System.out.println("Total Vowels : " + countVowels(str));
    }
    static int countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u' || str.charAt(i) == 'e'){
                count ++;
            }
        }
        return count;
    }
}
