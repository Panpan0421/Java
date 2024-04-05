package org.example;

import java.util.Scanner;

public class e2_52 {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while (num != -1) {
            if (hasEight(num)) {
                sum += num;
            }

            num = in.nextInt();
        }

        System.out.println(sum);
    }

    public static boolean hasEight(int num) {
        while (num > 0) {
            int n = num % 10;
            if (n % 8 == 0) {
                return true;
            }
            num /= 10;
        }

        return false;
    }
}
