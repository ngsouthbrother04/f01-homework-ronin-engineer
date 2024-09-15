package _10_Exception.Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            if(n < 0) throw new NumberFormatException("So am khong hop le");
            System.out.println("So vua nhap la " + n);
        } catch (NumberFormatException e) {
            try {
                throw new NegativeNumberException("Da nhap 1 so am");
            } catch (NegativeNumberException ex) {
                System.err.println(ex);
            }
        }
    }
}