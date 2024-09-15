package _11_DataStucture;
import java.util.*;

public class Bai1 {
    public static List<List<Integer>> solve(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        if (numRows == 0) {
            return pascalTriangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = pascalTriangle.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1);

            pascalTriangle.add(curr);
        }

        return pascalTriangle;
    }
}
