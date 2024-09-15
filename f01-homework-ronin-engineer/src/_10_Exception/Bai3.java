package _10_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int sum = 0;
        boolean valid = false;

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt(), b = sc.nextInt();
            sum = a + b;
            valid = true;
        } catch (InputMismatchException e) {
            System.err.println(e);
        } finally {
            if (valid) System.out.println("Tong 2 so: " + sum);
            else System.out.println("Nhap sai dinh dang");
        }
    }
}