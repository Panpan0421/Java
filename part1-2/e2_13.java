package org.example;

import java.util.Scanner;

public class e2_13 {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;

        int maxinum, mininum;
        if (num1 > num2) {
            maxinum = num1;
        } else {
            maxinum = num2;
        }
        if (maxinum < num3) {
            maxinum = num3;
        }

        if (num1 < num2) {
            mininum = num1;
        } else {
            mininum = num2;
        }
        if (mininum > num3) {
            mininum= num3;
        }

        System.out.printf("%d %d %d %d", sum, product, maxinum, mininum);
    }
}
