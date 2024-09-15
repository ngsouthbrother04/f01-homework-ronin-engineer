package _04_Func_And_Loop;

import java.util.*;

public class Bai2 {
    public static int countVowels(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'U' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'I') {
                        ++cnt;
            }
        }
        return cnt;
    }

    public static int countConsonants(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) != 'a' && s.charAt(i) != 'A' && s.charAt(i) != 'o' && s.charAt(i) != 'O' &&
                    s.charAt(i) != 'e' && s.charAt(i) != 'E' &&
                    s.charAt(i) != 'u' && s.charAt(i) != 'U' &&
                    s.charAt(i) != 'i' && s.charAt(i) != 'I' && s.charAt(i) != ' ') {
                        ++cnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("The number of vowels is " + countVowels(s));
        System.out.println("The number of consonants is " + countConsonants(s));
    }
}