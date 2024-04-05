package org.example;

import java.util.Scanner;

public class e2_68 {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();

        int[][] nums = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i ++ ) {
            nums[i][0] = 1;
        }

        for (int i = 1; i < SIZE; i ++ ) {
            for (int j = 1; j <= i; j ++ ) {
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
            }
        }

        for (int i = 0; i < SIZE; i ++ ) {
            for (int j = 0; j < SIZE - i - 1; j ++ ) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k ++ ) {
                System.out.print(nums[i][k] + "   ");
            }

            System.out.println();
        }
    }
}
