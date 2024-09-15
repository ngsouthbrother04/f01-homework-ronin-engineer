package _02_Variable_and_Datatype;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tien500 = 0, tien200 = 0, tien100 = 0, tien20 = 0, tien10 = 0, tien5 = 0, tien2 = 0, tien1 = 0;

        while(n > 0) {
            if(n >= 500) {
                tien500 = n / 500;
                n %= 500;
            }
            else if(n >= 200) {
                tien200 = n / 200;
                n %= 200;
            }
            else if(n >= 100) {
                tien100 = n / 100;
                n %= 100;
            }
            else if(n >= 20) {
                tien20 = n / 20;
                n %= 20;
            }
            else if(n >= 10) {
                tien10 = n / 10;
                n %= 10;
            }
            else if(n >= 5) {
                tien5 = n / 5;
                n %= 5;
            }
            else if(n >= 2) {
                tien2 = n / 2;
                n %= 2;
            }
            else {
                tien1 = n;
                n = 0;
            }
        }
        int tong = tien100 + tien2 + tien1 + tien5 + tien10 + tien20 + tien200 + tien500;

        System.out.println("So to 500: " + tien500);
        System.out.println("So to 200: " + tien200);
        System.out.println("So to 100: " + tien100);
        System.out.println("So to 20: " + tien20);
        System.out.println("So to 10: " + tien10);
        System.out.println("So to 5: " + tien5);
        System.out.println("So to 2: " + tien2);
        System.out.println("So to 1: " + tien1);
    }
}