package _04_Func_And_Loop;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if(s.length() != 12) System.out.println("Vui lòng nhập chuỗi có độ dài 12 số");
        int d13 = 10 - (Integer.parseInt(String.valueOf(s.charAt(0))) + 3 * Integer.parseInt(String.valueOf(s.charAt(1))) + Integer.parseInt(String.valueOf(s.charAt(2))) + 3 * Integer.parseInt(String.valueOf(s.charAt(3))) + Integer.parseInt(String.valueOf(s.charAt(4))) + 3 * Integer.parseInt(String.valueOf(s.charAt(5))) + Integer.parseInt(String.valueOf(s.charAt(6))) + 3 * Integer.parseInt(String.valueOf(s.charAt(7))) + Integer.parseInt(String.valueOf(s.charAt(8))) + 3 * Integer.parseInt(String.valueOf(s.charAt(9))) + Integer.parseInt(String.valueOf(s.charAt(10))) + 3 * Integer.parseInt(String.valueOf(s.charAt(11)))) % 10;
        if(d13 != 10) System.out.println(s + d13);
        else System.out.println(s + 0);
    }
}