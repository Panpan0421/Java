package org.example;

import java.util.Scanner;

public class e2_22 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        int cnt = 0;
        for (int i = 0; i < 3; i ++ ) {
            boolean isVaild = false;
            while (!isVaild) {
                if (num >= 0 && num <= 100) {
                    System.out.println("YES");
                    isVaild = true;
                    cnt ++;
                } else {
                    System.out.println("NO");
                    num = in.nextInt();
                }
            }

            if (cnt < 3) {
                num = in.nextInt();
            }
        }
    }
}

