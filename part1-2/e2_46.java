package org.example;

import java.util.Scanner;

public class e2_46 {
    public static void main(String[] args) {
        final int NUM;

        Scanner in = new Scanner(System.in);
        NUM = in.nextInt();
        int[] items = new int[NUM];

        for (int i = 0; i < NUM; i ++ ) {
            items[i] = in.nextInt();
        }

    for (int i = 0; i < NUM; i ++ ) {
        System.out.print(i + ":" );
        for (int j = 0; j < items[i]; j ++ ) {
            System.out.print("*");
        }
        System.out.print("(" + items[i] + ")");
        System.out.println();
    }
    }
}
