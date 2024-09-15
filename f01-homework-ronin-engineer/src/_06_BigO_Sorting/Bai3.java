package _06_BigO_Sorting;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n]; int[] b = new int[m];

        for(int i = 0; i < n; ++i) a[i] = sc.nextInt();
        for(int i = 0; i < m; ++i) b[i] = sc.nextInt();

        int[] newArr = merge(a, b);

        for(int x : newArr) System.out.print(x + " ");
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];

            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            result[k++] = nums1[i++];
        }
        while (j < n2) {
            result[k++] = nums2[j++];
        }

        return result;
    }
}
