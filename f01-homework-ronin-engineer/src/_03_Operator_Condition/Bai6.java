package _03_Operator_Condition;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a + b > c || b + c > a || c + a > b) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}