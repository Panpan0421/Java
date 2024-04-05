package org.example;

public class e2_76 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i ++ ) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j ++ ) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 1};

        System.out.println("排序前的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\n排序后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
