package org.example;

import java.util.Scanner;

public class e2_57 {
    public static void main(String[] args) {
        final int SIZE1, SIZE2;

        Scanner in = new Scanner(System.in);
        SIZE1 = in.nextInt();
        SIZE2 = in.nextInt();

        int[] arr1 = new int[SIZE1];
        int[] arr2 = new int[SIZE2];
        for (int i = 0; i < SIZE1; i ++ ) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < SIZE2; i ++ ) {
            arr2[i] = in.nextInt();
        }

        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i ++ ) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
