package _09_ClassDesign.Bai03.StringBuilder;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);

        System.out.println(s.toUpperCase());
        System.out.println(str.reverse());
    }
}
