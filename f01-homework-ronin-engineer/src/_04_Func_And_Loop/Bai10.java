package _04_Func_And_Loop;

import java.util.*;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String chu = "";
        String so = "";
        String kt = "";

        for(char c : s.toCharArray()) {
            if(Character.isAlphabetic(c)) chu += c;
            else if(Character.isDigit(c)) so += c;
            else kt += c;
        }

        System.out.println("Chuoi so: " + so);
        System.out.println("Chuoi chu: " + chu);
        System.out.println("Chuoi dac biet: " + kt);
    }
}
