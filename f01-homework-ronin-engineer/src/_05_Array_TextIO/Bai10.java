package _05_Array_TextIO;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test = 1; test <= T; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] A = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            int[][] transposeA = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    transposeA[j][i] = A[i][j];
                }
            }

            int[][] product = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        product[i][j] += A[i][k] * transposeA[k][j];
                    }
                }
            }

            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}