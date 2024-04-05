package org.example;

import java.util.Locale;
import java.util.Scanner;

public class e2_35 {
    public static void main(String[] args) {
        String str;

        Scanner in = new Scanner(System.in);
        str = in.next().toUpperCase(Locale.ROOT);
        in.close();

        for (int i = 0; i < str.length(); i ++ ) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'W') {
                System.out.printf("%c", str.charAt(i) + 3);
            } else if (str.charAt(i) == 'X') {
                System.out.print('A');
            } else if (str.charAt(i) == 'Y') {
                System.out.print('B');
            } else {
                System.out.print('C');
            }
        }
    }
}
