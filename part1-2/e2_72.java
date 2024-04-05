package org.example;

import java.util.Scanner;

public class e2_72 {
    public static int len(int n) {
        if (n / 10 == 0) {
            return 1;
        } else {
            return len(n / 10) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(len(n));
    }
}
