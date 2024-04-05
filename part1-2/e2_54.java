package org.example;

import javafx.beans.binding.StringBinding;

import java.util.Scanner;

public class e2_54 {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();

        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i ++ ) {
            nums[i] = in.nextInt();
        }

        String str = arrayToString(nums);
        System.out.println(str);
    }

    public static String arrayToString(int[] array) {
        StringBuilder str1 = new StringBuilder();

        str1.append("[");
        for (int i = 0; i < array.length; i ++ ) {
            if (i < array.length - 1) {
                str1.append(array[i] + ", ");
            } else {
                str1.append(array[i]);
            }
        }
        str1.append("]");

        return str1.toString();
    }
}
