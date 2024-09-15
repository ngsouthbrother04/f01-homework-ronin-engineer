package _06_BigO_Sorting;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] payments = new int[N];
        for (int i = 0; i < N; i++) {
            payments[i] = scanner.nextInt();
        }
        String ans = canSell(payments) ? "YES" : "NO";
        System.out.println(ans);
    }

    public static boolean canSell(int[] payments) {
        int balance = 0;
        for (int payment : payments) {
            if (payment == 25) {
                balance += 25;
            } else if (payment == 50) {
                if (balance < 25) {
                    return false;
                }
                balance -= 25;
            } else {
                if (balance < 75) {
                    return false;
                }
                balance -= 75;
            }
        }
        return true;
    }
}
