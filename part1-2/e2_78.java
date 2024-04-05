package org.example;

import java.util.Scanner;

public class e2_78 {
    static final int N = 100010;
    static int[] q = new int[N];

    public static void quickSort(int[] q, int l, int r) {
        if (l >= r) return;

        int i = l - 1, j = r + 1, x = q[(l + r) >> 1];
        while (i < j) {
            do { i++; } while (q[i] < x);
            do { j--; } while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            q[i] = scanner.nextInt();
        }

        quickSort(q, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
