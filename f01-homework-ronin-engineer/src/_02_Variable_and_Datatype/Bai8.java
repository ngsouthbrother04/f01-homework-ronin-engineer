package _02_Variable_and_Datatype;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n <= 0) System.out.println("Vui lòng nhập số dương");
        else {
            int tmp = 0;
            for(int i = 1; i < n; ++i) {
                if(n % i == 0) tmp += i;
            }

            if(tmp == n) System.out.println("Là số hoàn hảo");
            else System.out.println("Không là số hoàn hảo");
        }
    }
}