package _11_DataStructure;

import java.util.*;

public class Bai8 {
    public static boolean solve(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if(c == '{' || c == '[' || c == '(') {
                st.push(c);
            }

            else if(c == ')' || c == '}' || c == ']') {
                if(st.isEmpty() || !check(st.pop(), c)) return false;
            }
        }

        return st.isEmpty();
    }

    public static boolean check(char fi, char se) {
        return (fi == '(' && se == ')') || (fi == '{' && se == '}') || (fi == '[' && se == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(solve(s));
    }
}
