package _10_Exception;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        div(a, b);
    }

    public static void div(int a, int b) {
        try {
            int ans = a / b;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
    }
}
