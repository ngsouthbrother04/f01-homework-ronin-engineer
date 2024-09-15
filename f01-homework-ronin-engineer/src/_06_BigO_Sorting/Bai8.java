package _06_BigO_Sorting;

import java.util.*;

public class Bai8 {
    //Tư tưởng bài chỉ đơn giản cần 4 màu khác nhau => s1 != s2 != s3 != s4 => Dùng set
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();

        Set<Integer> colors = new HashSet<>();
        colors.add(s1); colors.add(s2); colors.add(s3); colors.add(s4);

        int distinctColors = colors.size();
        int needToBuy = 4 - distinctColors;

        System.out.println(needToBuy);
    }
}