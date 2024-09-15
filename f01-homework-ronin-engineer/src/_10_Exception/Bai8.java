package _10_Exception;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            pow(n);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }

    public static void pow(int n) throws IllegalArgumentException {
        if(n < 0) throw new IllegalArgumentException("Khong the nhap so am");
        System.out.println("Can bac hai la " + (int)Math.sqrt(n));
    }
}