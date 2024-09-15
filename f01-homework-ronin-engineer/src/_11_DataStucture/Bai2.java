package _11_DataStucture;
public class Bai2 {
    public static int[] solve(int[] a) {
        int n = a.length;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }

        int[] newNum = new int[n + 1];
        newNum[0] = 1;
        return newNum;
    }    
}