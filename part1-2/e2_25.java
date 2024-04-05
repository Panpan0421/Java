package org.example;

import java.util.Scanner;

public class e2_25 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (int i = 0; i < size; i ++ ) {
            if (i % 2 == 0) {
                System.out.println("# # # # # # #");
            } else {
                System.out.println(" # # # # # # #");
            }
        }
    }
}
