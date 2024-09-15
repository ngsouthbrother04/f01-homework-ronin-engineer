package _04_Func_And_Loop;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        A(n);
        B(n);
        C(n);
        D(n);
    }

    public static void A(int n) {
        System.out.println("Hinh A: ");
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void B(int n) {
        System.out.println("Hinh B: ");
        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void C(int n) {
        System.out.println("Hinh C: ");
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void D(int n) {
        System.out.println("Hinh D: ");
        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}