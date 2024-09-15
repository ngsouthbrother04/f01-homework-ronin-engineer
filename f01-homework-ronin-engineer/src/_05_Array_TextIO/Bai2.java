package _05_Array_TextIO;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int pos = -1;

        for(int i = 0; i < a.length; ++i) {
            if(a[i] == k) pos = i;
        }

        System.out.println("Vi tri trong mang a co gia tri bang k: " + pos);
    }
}
