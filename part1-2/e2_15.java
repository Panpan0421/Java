package org.example;

import java.util.Scanner;

public class e2_15 {
    public static void main(String[] agrs) {
        int num1, num2;

        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " + num2);
    }
}
