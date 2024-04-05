package org.example;

import java.util.Scanner;

public class e2_53 {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();

        Double[] nums = new Double[SIZE];
        for (int i = 0; i < SIZE; i ++ ) {
            nums[i] = in.nextDouble();
        }
        print(nums);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++ ) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
    }

    public static void print(Double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
    }

    public static void print(Float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++ ) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
    }
}
