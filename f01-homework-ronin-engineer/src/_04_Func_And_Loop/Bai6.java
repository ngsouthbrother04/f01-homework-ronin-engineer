package _04_Func_And_Loop;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        int fi = Integer.MIN_VALUE;
        int se = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; ++i) {
            if(a[i] > fi) {
                se = fi;
                fi = a[i];
            }
            else if(a[i] > se && a[i] != fi) se = a[i];
        }

        if(se != Integer.MIN_VALUE) System.out.println("So lon thu 2 trong day: " + se);
        else System.out.println("Khong tim thay so lon thu 2 trong day");
    }
}
