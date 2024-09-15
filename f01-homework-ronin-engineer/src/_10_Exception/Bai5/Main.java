package _10_Exception.Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            check(age);
            System.out.println("Tuoi hop le");
        } catch (InvalidAgeException e) {
            System.err.println(e);
        }
    }
    public static void check(int age) throws InvalidAgeException {
        if(age < 18) throw new InvalidAgeException("Tuoi phai lon hon 18");
    }
}