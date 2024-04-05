package org.example;

import java.util.Scanner;

public class e2_51 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();

        if (isOdd(num)) {
            System.out.println("Is");
        } else {
            System.out.println("Is not");
        }
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
