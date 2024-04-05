package org.example;

import java.util.Scanner;

public class e2_30 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= i; j ++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= size + 1 - i; j ++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= size; i ++ ) {
            for (int j = 8; j >= 1; j -- ) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= size; i ++ ) {
            for (int j = size + 1 - i; j >= 1; j -- ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
