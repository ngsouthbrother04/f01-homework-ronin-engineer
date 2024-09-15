package _03_Operator_Condition;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) System.out.println("A lon hon B");
        else if(a < b) System.out.println("A nho hon B");
        else System.out.println("A bang B");
    }
}