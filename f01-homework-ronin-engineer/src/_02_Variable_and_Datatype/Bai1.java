package _02_Variable_and_Datatype;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inp = sc.nextDouble();
        double conv = inp * 2.54;

        System.out.println("Gia tri chuyen doi: " + conv);
    }
}