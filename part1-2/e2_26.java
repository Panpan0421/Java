package org.example;

import java.util.Scanner;

public class e2_26 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (int i = 0; i < size; i ++ )
            for (int j = 0; j < size; j ++ ) {
                System.out.printf("%4d ", (i + 1) * (j + 1));
                if (j == size - 1) {
                    System.out.println();
                }
            }
    }
}
