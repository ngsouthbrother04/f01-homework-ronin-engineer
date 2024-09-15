package _05_Array_TextIO;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tCase = sc.nextInt();
        while(tCase != 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(UCLN(a, b) + " " + BCNN(a, b));
            --tCase;
        }
    }

    public static int UCLN(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int BCNN(int a, int b) {
        return a / UCLN(a, b) * b;
    }
}