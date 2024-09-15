package _05_Array_TextIO;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                a[i][j] = sc.nextInt();
            }
        }

        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(a[i][j] > maxVal) maxVal = a[i][j];
            }
        }

        System.out.println("Gia tri lon nhat trong ma tran: " + maxVal);
    }
}
