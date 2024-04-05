package org.example;

public class e2_58 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int[] arr1 = copyOf(arr);
        int[] arr2 = copyOf(arr, 5);

        for (int i = 0; i < arr1.length; i ++ ) {
            System.out.print(arr1[i]);
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i ++ ) {
            System.out.print(arr2[i]);
        }
    }

    public static int[] copyOf(int[] array) {
        int[] newarr= new int[array.length];
        for (int i = 0; i < array.length; i ++ ) {
            newarr[i] = array[i];
        }

        return newarr;
    }

    public static int[] copyOf(int[] array, int size) {
        int[] newarr= new int[size];

        for (int i = 0; i < array.length; i ++ ) {
            newarr[i] = array[i];
        }

        if (size > array.length) {
            for (int i = array.length; i < size; i ++ ) {
                newarr[i] = 0;
            }
        }

        return newarr;
    }
}
