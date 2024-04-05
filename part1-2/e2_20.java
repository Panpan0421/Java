package org.example;

import java.util.Scanner;

public class e2_20 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            System.out.print(num % 10);
            num /= 10;
        }
        System.out.println();
        System.out.println(sum);
    }
}
