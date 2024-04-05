package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class e2_45 {
    public static void main(String[] args) {
        final int NUM_ITEMS;

        Scanner in = new Scanner(System.in);
        NUM_ITEMS = in.nextInt();

        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i ++ ) {
            items[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(items));
    }
}
