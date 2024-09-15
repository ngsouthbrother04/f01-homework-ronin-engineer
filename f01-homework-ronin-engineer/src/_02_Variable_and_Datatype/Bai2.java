package _02_Variable_and_Datatype;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);
        double n = sc.nextDouble();
        double ans = 0;

        if(s == 'F') {
            ans = (n - 32.0) * 0.555;
        }
        if(s == 'C') {
            ans = n * 1.8 + 32;
        }
        System.out.println(ans);
    }
}
