package _03_Operator_Condition;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0) System.out.println("Chan");
        else System.out.println("Le");

        if(n > 0) System.out.println("Duong");
        else if(n == 0) System.out.println("Khong am khong duong");
        else System.out.println("Am");
    }
}