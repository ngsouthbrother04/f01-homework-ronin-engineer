package _06_BigO_Sorting;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();

        if(a == v) {
            System.out.println(1);
            return;
        }

        int realDis = a - b;
        int days = (v - b)/realDis;
        if((v - b) % realDis != 0) ++days;
        System.out.println(days);
    }
}
