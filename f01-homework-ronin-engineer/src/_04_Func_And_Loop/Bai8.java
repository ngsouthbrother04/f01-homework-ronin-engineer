package _04_Func_And_Loop;

import java.util.Scanner;

public class Bai8 {
    public static boolean cp(int n) {
        int t = (int)Math.sqrt(n);
        return t * t == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Số chính phương nhỏ hơn n: ");
        for(int i = 1; i < n; ++i) {
            if(cp(i)) System.out.println(i);
        }
    }
}
