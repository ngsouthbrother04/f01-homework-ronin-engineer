package _11_DataStructure;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            String command = sc.next();

            switch (command) {
                case "init":
                    stack = new Stack<>();
                    break;

                case "push":
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case "pop":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;

                case "top":
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;

                case "end":
                    sc.close();
                    return;

                default:
                    System.out.println("Vui long nhap dung mo ta");
            }
        }
    }
}
