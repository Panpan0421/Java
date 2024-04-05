package org.example;

import java.util.Scanner;

public class e2_60 {
    public static void main(String[] agrs) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();

        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i ++ ) {
            nums[i] = in.nextInt();
        }

        reverse(nums);
    }

    public static void reverse(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i -- ) {
            System.out.print(nums[i]);
        }
    }
}
