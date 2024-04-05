package org.example;

import java.util.Scanner;

public class e2_19 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();

        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
}
