package org.example;

import java.util.Scanner;

public class e2_21 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        boolean isVaild = false;
        while (!isVaild) {
            if (num >= 0 && num <= 10 || num >= 90 && num <= 100) {
                System.out.println("YES");
                isVaild = true;
            } else {
                System.out.println("NO");
                num = in.nextInt();
            }
        }
    }
}
