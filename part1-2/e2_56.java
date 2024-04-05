package org.example;

import java.util.Scanner;

public class e2_56 {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();

        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i ++ ) {
            nums[i] = in.nextInt();
        }
        int key = in.nextInt();

        System.out.println(search(nums, key));
    }

    public static int search(int[] nums, int key) {
        for (int i = 0; i < nums.length; i ++ ) {
            if (nums[i] == key) {
                return i;
            }
        }

        return -1;
    }
}