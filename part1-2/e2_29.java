package org.example;

import java.util.Scanner;

public class e2_29 {
    public static void main(String[] args) {
        int rows;

        Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        in.close();

        for (int i = 0; i < rows; i ++ ) {
            for (int j = 0; j < 2 * rows - 1; j ++ ) {
                if (Math.abs(j - rows + 1) <= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < rows; i ++ ) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                if (Math.abs(j - rows + 1) <= rows - i - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < rows; i ++ ) {
            for (int j = 0; j < 2 * rows - 1; j ++ ) {
                if (Math.abs(j - rows + 1) <= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < rows; i ++ ) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                if (Math.abs(j - rows + 1) <= rows - i - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < rows; i ++ ) {
            for (int j = 0; j < 2 * rows - 1; j ++ ) {
                if (Math.abs(j - rows + 1) <= i - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i < rows + 2; i ++ ) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                if (Math.abs(j - rows + 1) <= rows - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
