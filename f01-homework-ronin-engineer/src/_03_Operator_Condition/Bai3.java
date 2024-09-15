package _03_Operator_Condition;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double thuong = 0;
        long tong = a + b;
        long tich = a * b;
        int hieu = a - b;

        if(b != 0) thuong = (double)a / b;

        System.out.println("Tong: " + tong);
        System.out.println("Tich: " + tich);
        System.out.println("Hieu: " + hieu);
        System.out.println("Thuong: " + thuong);
    }
}