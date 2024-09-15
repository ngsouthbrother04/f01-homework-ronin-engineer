package _02_Variable_and_Datatype;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        final int minPerHour = 60;
        final int hourPerDay = 24;
        final int dayPerYear = 365;

        long nam = n / (minPerHour * hourPerDay * dayPerYear);
        n %= (minPerHour * hourPerDay * dayPerYear);

        long ngay = n / (minPerHour * hourPerDay);
        n %= (minPerHour * hourPerDay);

        long gio = n / minPerHour;
        long phut = n % minPerHour;


        System.out.println(nam + " year - " + ngay + " ngay - " + gio + " gio - " + phut + " phut");
    }
}
