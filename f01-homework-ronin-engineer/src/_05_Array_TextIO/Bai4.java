package _05_Array_TextIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hang = sc.nextInt(), cot = sc.nextInt(), tang = sc.nextInt();
        int[][][] a = new int[tang][hang][cot];

        for(int i = 0; i < tang; ++i) {
            for(int j = 0; j < hang; ++j) {
                for(int k = 0; k < cot; ++k) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        try {
            print3D(a, hang, cot, tang);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void print3D(int[][][] a, int hang, int cot, int tang) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("D:\\JavaProject\\F00\\src\\Buoi5\\out.txt");

        for(int i = 0; i < tang; ++i) {
            for(int j = 0; j < hang; ++j) {
                for(int k = 0; k < cot; ++k) {
                    out.print(a[i][j][k] + " ");
                }
                out.println("");
            }
            out.println("");
        }
        out.close();
    }
}
