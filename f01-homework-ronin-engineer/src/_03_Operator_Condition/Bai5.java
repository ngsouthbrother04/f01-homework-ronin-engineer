package _03_Operator_Condition;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double C = 2 * (a + b);
        double S = a * b;

        System.out.println("Chu vi: " + C);
        System.out.println("Dien tich: " + S);
    }
}