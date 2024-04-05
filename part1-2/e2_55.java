package org.example;

import java.util.Scanner;

public class e2_55 {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();

        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i ++ ) {
            nums[i] = in.nextInt();
        }
        int key = in.nextInt();

        System.out.println(contains(nums, key));
    }

    public static boolean contains(int[] nums, int key) {
        for (int i = 0; i < nums.length; i ++ ) {
            if (nums[i] == key) {
                return true;
            }
        }

        return false;
    }
}
