package _11_DataStructure;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();

            switch (query) {
                case 1:
                    System.out.println(queue.size());
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;

                case 3:
                    int x = sc.nextInt();
                    queue.add(x);
                    break;

                case 4:
                    if (!queue.isEmpty()) {
                        queue.poll();
                    }
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;

                case 6:
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(((LinkedList<Integer>) queue).peekLast());
                    }
                    break;

                default:
                    break;
            }
        }
    }
}