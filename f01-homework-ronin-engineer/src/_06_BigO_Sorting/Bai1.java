package _06_BigO_Sorting;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int maxV = Integer.MIN_VALUE;

        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; ++i) {
            if(a[i] > maxV) maxV = a[i];
        }

        int[] cnt = new int[maxV + 1];
        for(int x : a) {
            cnt[x]++;
        }

        for(int i = 0; i < cnt.length; ++i) {
            if(cnt[i] != 0) System.out.println(i + " " + cnt[i]);
        }
    }
}