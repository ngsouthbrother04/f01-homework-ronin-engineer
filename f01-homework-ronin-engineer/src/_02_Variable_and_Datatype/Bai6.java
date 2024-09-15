package _02_Variable_and_Datatype;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 1 || number > 1000) {
            System.out.println("Số nhập vào chỉ từ 1 -> 1000");
        } else {
            String result = "";

            int hundreds = number / 100;
            if (hundreds >= 1 && hundreds <= 3) {
                result += "C".repeat(hundreds);
            } else if (hundreds == 4) {
                result += "CD";
            } else if (hundreds >= 5 && hundreds <= 8) {
                result += "D" + "C".repeat(hundreds - 5);
            } else {
                result += "CM";
            }

            int tens = (number % 100) / 10;
            if (tens >= 1 && tens <= 3) {
                result += "X".repeat(tens);
            } else if (tens == 4) {
                result += "XL";
            } else if (tens >= 5 && tens <= 8) {
                result += "L" + "X".repeat(tens - 5);
            } else {
                result += "XC";
            }

            int units = number % 10;
            if (units >= 1 && units <= 3) {
                result += "I".repeat(units);
            } else if (units == 4) {
                result += "IV";
            } else if (units >= 5 && units <= 8) {
                result += "V" + "I".repeat(units - 5);
            } else {
                result += "IX";
            }

            System.out.println("Số La Mã tương ứng: " + result);
        }
    }
}