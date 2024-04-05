package org.example;

import java.util.Scanner;

public class e2_31 {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        int factorial = 1;
        for (int i = 1; i <= n; i ++ ) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
