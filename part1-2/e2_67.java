package org.example;

import java.util.Scanner;

public class e2_67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        print(size);
    }

    public static void print(int size) {
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
}
