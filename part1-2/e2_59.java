package org.example;

import java.util.Arrays;

public class e2_59 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        boolean flag = swap(arr1, arr2);

        if (flag) {
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        } else {
            System.out.println("长度不同，无法交换");
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }
}