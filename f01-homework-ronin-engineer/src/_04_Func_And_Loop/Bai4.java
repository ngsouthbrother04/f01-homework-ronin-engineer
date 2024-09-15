package _04_Func_And_Loop;

public class Bai4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 9; j++) {
                if (i * j <= 100) {
                    System.out.print(i * j + " : " + j + " = " + i + "\t");
                }
            }
            System.out.println();
        }
    }
}