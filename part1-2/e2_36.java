package org.example;

import java.util.Locale;
import java.util.Scanner;

public class e2_36 {
    public static void main(String[] args) {
        String str;

        Scanner in = new Scanner(System.in);
        str = in.next().toUpperCase(Locale.ROOT);
        in.close();

        for (int i = 0; i < str.length(); i ++ ) {
            if (str.charAt(i) >= 'D' && str.charAt(i) <= 'Z') {
                System.out.printf("%c", str.charAt(i) - 3);
            } else if (str.charAt(i) == 'A') {
                System.out.print('X');
            } else if (str.charAt(i) == 'B') {
                System.out.print('Y');
            } else {
                System.out.print('Z');
            }
        }
    }
}
