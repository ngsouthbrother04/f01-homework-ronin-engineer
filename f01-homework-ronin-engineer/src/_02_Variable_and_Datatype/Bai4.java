package _02_Variable_and_Datatype;

import java.util.Scanner;

public class Bai4 {
    public static long gt(int n) {
        if(n == 1) return 1;
        else return n * gt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(gt(n));
    }
}
