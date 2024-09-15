package _02_Variable_and_Datatype;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dec = sc.nextInt();
        String bin = "";

        while(dec > 0) {
            bin += (dec % 2);
            dec /= 2;
        }
        bin += 0;
        for(int i = bin.length() - 1; i >= 0; --i) {
            System.out.print(bin.charAt(i));
        }
    }
}
