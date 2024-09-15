package _05_Array_TextIO;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tCase = sc.nextInt();
        while(tCase-- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
    }

    public static void solve(int n) {
        int tmp = 0;
        for(int i = 1; i <= n; ++i) {
            if(n % i == 0) {
                if(i % 2 == 0) ++tmp;
            }
        }
        System.out.println(tmp);
    }
}