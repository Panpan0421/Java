package org.example;

import java.util.Scanner;

public class e2_24 {
    public static void main(String[] args) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        int i = 0;
        while (i != size) {
            System.out.println("# # # # #");
            i ++ ;
        }
    }
}
