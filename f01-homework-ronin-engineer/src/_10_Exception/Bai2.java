package _10_Exception;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;

        while(!valid) {
            try {
                n = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println(e);
                sc.next();
            }
        }
        System.out.println("So ban vua nhap la: " + n);
    }
}