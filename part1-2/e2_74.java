package org.example;

public class e2_74 {
    public static int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + r >> 1;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int x = 3;

        int index = binarySearch(arr, x);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("未中找到");
        }
    }
}
