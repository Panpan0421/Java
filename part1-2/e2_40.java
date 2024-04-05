package org.example;

import java.util.Locale;
import java.util.Scanner;

public class e2_40 {
    public static void main(String[] args) {
        String str;
        int flag = 0;

        Scanner in = new Scanner(System.in);
        str = in.next().toUpperCase(Locale.ROOT);
        in.close();

        for (int i = 0; i < str.length(); i ++ ) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'F')) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("is a binary string");
        } else {
            System.out.println("is not a binary string");
        }
    }
}
