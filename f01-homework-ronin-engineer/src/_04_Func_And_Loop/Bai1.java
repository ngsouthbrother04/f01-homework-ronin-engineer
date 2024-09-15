package _04_Func_And_Loop;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i >= 1; --i) {
            for(int j = i; j >= 1; --j) {
                System.out.print(j + " ");
            }
            for(int j = 2; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}