package _05_Array_TextIO;

import java.io.*;
import java.util.*;

public class Bai5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\JavaProject\\F00\\src\\Buoi5\\inp.txt"));

        int sum = 0;

        while(sc.hasNext()) {
            sum += sc.nextInt();
        }

        PrintWriter out = new PrintWriter("D:\\JavaProject\\F00\\src\\Buoi5\\out.txt");
        out.println("Tong: " + sum);
        out.close();
    }
}
