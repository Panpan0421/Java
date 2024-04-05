package org.example;

import java.util.Scanner;

public class e2_63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char op = in.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2); break;
            case '-':
                System.out.println(num1 - num2); break;
            case '*':
                System.out.println(num1 * num2); break;
            case '/':
                System.out.println((double)num1 / num2); break;
            default:
                System.out.println("输入无效！");
        }
    }
}
