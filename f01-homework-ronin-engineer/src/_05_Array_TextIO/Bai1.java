package _05_Array_TextIO;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for(int x : a) sum += x;
        System.out.println("Tong mang: " + sum);
    }
}
