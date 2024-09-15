package _10_Exception.Bai09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();

        try {
            System.out.print("Nhap so tien can rut: ");
            double amount = sc.nextDouble();
            ba.withDraw(amount);
            System.out.println("Rut tien thanh cong");
            System.out.println("So du trong tai khoan ban con: " + ba.getMoney());
        } catch(InsufficientFundsException e) {
            System.err.println(e);
        }
    }
}