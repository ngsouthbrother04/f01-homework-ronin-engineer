package _10_Exception;

import java.io.File;
import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        File f = new File("D:\\JavaProject\\F00\\src\\Buoi10\\input.txt");

        if(!f.exists()) {
            System.err.println("File khong ton tai"); return;
        }

        try(Scanner sc = new Scanner(f)) {
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch(Exception e) {
            System.err.println(e);
        }
    }
}