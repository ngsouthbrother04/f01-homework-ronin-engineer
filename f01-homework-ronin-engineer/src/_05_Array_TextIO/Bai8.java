package _05_Array_TextIO;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tCase = sc.nextInt();

        while(tCase-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            int pos = solve(a, n);
            if(pos != -1) System.out.println(pos);
            else System.out.println("NO");
        }
    }

    public static int solve(int[] a, int n) {
        int pos = -1;
        for(int i = 0; i < n - 1; ++i) {
             for(int j = i + 1; j < n; ++j) {
                 if(a[i] == a[j]) pos = a[i];
             }
        }
        return pos;
    }
}
