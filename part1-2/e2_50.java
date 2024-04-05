package org.example;

import java.util.Scanner;

public class e2_50 {
    public static void main(String[] args) {
        int base, exp, ans;

        Scanner in = new Scanner(System.in);
        base = in.nextInt();
        exp = in.nextInt();
        in.close();

        System.out.println(exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int product = 1;

        for (int i = 0; i < exp; i ++ ) {
            product *= base;
        }

        return product;
    }
}
