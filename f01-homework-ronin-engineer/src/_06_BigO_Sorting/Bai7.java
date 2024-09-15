package _06_BigO_Sorting;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int daysDiffColor = Math.min(n, m);
        int daysSameColor = (n - daysDiffColor) / 2 + (m - daysDiffColor) / 2;

        System.out.println(daysDiffColor + " " + daysSameColor);
    }
}