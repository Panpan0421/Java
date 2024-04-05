package org.example;

import java.util.Scanner;

public class e2_23 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (int i = 0; i < size; i ++ ) {
            System.out.println("# # # # #");
        }
    }
}
