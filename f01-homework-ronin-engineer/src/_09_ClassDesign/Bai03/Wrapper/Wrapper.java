package _09_ClassDesign.Bai03.Wrapper;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(a + b);
    }
}