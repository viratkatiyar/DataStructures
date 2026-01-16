package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacter {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = scan.nextLine();
        // lowercase string given
        // "raghav" then output = a
        // "character" then output = a , a = 2, c = 2, r = 2 but lexicographically answer because a is small
        System.out.println("Most Frequent Character in String : " + freqChar3(s));
    }
    static char freqChar(String s){
        // approach 1 brute force O(n^2)
        int maxFreq = -1;
        char ans = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            int freq = 1;
            char ch = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(j) == ch){
                    freq ++;
                }
            }
            if (freq > maxFreq){
                maxFreq = freq;
                ans = ch;
            }
            if(freq == maxFreq && ch < ans){
                ans = ch;
            }
        }
        return ans;
    }
    static char freqChar2(String s){
        // approach 2 sorting & Sliding Window
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        char ans = ch[0];
        int maxFreq = -1;
        int i = 0, j = 0;
        while(j < ch.length){
            if(ch[i] == ch[j]){
                j ++;
            }
            else{
                int freq = j - i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = ch[i];
                }
                i = j;
            }
        }
        int freq = j - i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = ch[i];
        }
        return ans;
    }
    static char freqChar3(String s){
       // approach 3 frequency array
       int[] freq = new int[26]; // default 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a'; // or minus by 97
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for (int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)('a' + i);
            }
        }
        return ans;
    }
}






