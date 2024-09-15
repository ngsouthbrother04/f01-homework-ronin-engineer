package _04_Func_And_Loop;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double pi = 0;

        for(int i = 1; i <= n; ++i) {
            pi += ((double)(Math.pow(-1, i + 1) / (2*i - 1)));
        }
        pi *= 4;

        System.out.println("Số pi = " + pi);
    }
}
