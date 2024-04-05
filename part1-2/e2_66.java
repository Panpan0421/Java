package org.example;

import java.util.Scanner;

public class e2_66 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();

        printA(size);
        printB(size);
        printC(size);
        printD(size);
        printE(size);
    }

    public static void printA(int size) {
        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= size - i; j ++ ){
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k ++ ) {
                System.out.print(k + " ");
            }

            for (int l = i - 1; l >= 1; l -- ) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }

    public static void printB(int size) {
        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= i - 1; j ++ ){
                System.out.print("  ");
            }

            for (int k = 1; k <= size - i + 1; k ++ ) {
                System.out.print(k + " ");
            }

            for (int l = size - i; l >= 1; l -- ) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }

    public static void printC(int size) {
        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= i; j ++ ) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= 2 * (size - i) - 1; k ++ ) {
                System.out.print("  ");
            }

            if (i != size) {
                for (int l = i; l >= 1; l -- ) {
                    System.out.print(l + " ");
                }
            } else {
                for (int l = i - 1; l >= 1; l -- ) {
                    System.out.print(l + " ");
                }
            }

            System.out.println();
        }
    }

    public static void printD(int size) {
        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= size - i + 1; j ++ ) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= 2 * (i - 1) - 1; k ++ ) {
                System.out.print("  ");
            }

            if (i != 1) {
                for (int l = size - i + 1; l >= 1; l -- ) {
                    System.out.print(l + " ");
                }
            } else {
                for (int l = size - i; l >= 1; l -- ) {
                    System.out.print(l + " ");
                }
            }

            System.out.println();
        }
    }

    public static void printE(int size) {
        for (int i = 1; i <= size; i ++ ) {
            for (int j = 1; j <= size - i; j ++ ){
                System.out.print("  ");
            }

            for (int k = i; k <= 2 * i - 1; k ++ ) {
                System.out.print(k % 10 + " ");
            }

            for (int l = 2 * i - 2; l >= i; l -- ) {
                System.out.print(l % 10 + " ");
            }

            System.out.println();
        }
    }
}
