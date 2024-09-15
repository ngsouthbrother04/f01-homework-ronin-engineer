package _02_Variable_and_Datatype;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double C = 0;
        double S = 0;

        if(a + b > c || a + c > b || b + c > a) {
            C = (a + b + c);
            double p = C / 2.0;
            S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            if((a == b && (a != c && b != c)) || (c == b && (c != a && b != a)) || (a == c && (a != c && c != b))) {
                System.out.println("Tam giac can");
            }
            else if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a)) {
                System.out.println("Tam giac vuong");
            }
            else if(a == b && b == c && c == a) {
                System.out.println("Tam giac deu");
            }
            else {
                System.out.println("Tam giac thuong");
            }

            System.out.println("Chu vi: " + C);
            System.out.println("Dien tich: " + S);
        }
        else {
            System.out.println("Khong phai tam giac");
        }
    }
}
