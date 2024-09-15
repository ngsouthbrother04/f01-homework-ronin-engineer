package _11_DataStucture;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();

            while(n > 0) {
                st.push(n % 2);
                n /= 2;
            }

            System.out.print("Ket qua: ");
            while(!st.isEmpty()) {
                System.out.print(st.pop());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
