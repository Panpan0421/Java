package org.example;

import java.util.Scanner;

public class e2_12 {
    public static void main(String[] args) {
        int num1, num2, sum;

        Scanner in = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        num1 = in.nextInt();
        System.out.print("请输入第一个数：");
        num2 = in.nextInt();
        in.close();

        sum = num1 + num2;
        System.out.println(sum);
    }
}
