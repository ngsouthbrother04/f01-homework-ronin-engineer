package _06_BigO_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (k == 0) {
            if (arr[0] > 1) {
                System.out.println(1);
            } else {
                System.out.println("-1");
            }
            return;
        }
        if (k == n) {
            System.out.println(arr[n - 1]);
            return;
        }

        int x = arr[k - 1];
        if (k < n && arr[k] == x) {
            System.out.println("-1");
        } else {
            System.out.println(x);
        }
    }
}