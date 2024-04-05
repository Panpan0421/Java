package org.example;

import java.util.Scanner;

public class e2_27 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();;
        in.close();

        for (int i = 0; i < size; i ++ ) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < size; i ++ ) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < size; i ++ ) {
            for (int j = 0; j < i; j ++ ) {
                System.out.print("  ");
            }

            for (int k = 0; k < size - i; k++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < size; i ++ ) {
            for (int j = 0; j < size - i - 1; j ++ ) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
