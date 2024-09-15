package _05_Array_TextIO;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        int l = 0, r = a.length - 1;
        boolean isLegit = true;

        while(l <= r) {
            if(a[l] != a[r]) isLegit = false;
            ++l; --r;
        }
        if(isLegit) System.out.println("YES");
        else System.out.println("NO");
    }
}