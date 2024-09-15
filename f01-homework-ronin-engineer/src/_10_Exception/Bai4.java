package _10_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        try {
            int idx = sc.nextInt();
            int val = sc.nextInt();

            a[idx] = val;
            System.out.println("Gia tri tai vi tri " + idx + " duoc gan bang: " + val);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}