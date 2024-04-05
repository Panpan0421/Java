package org.example;

import java.util.Locale;
import java.util.Scanner;

public class e2_37 {
    public static void main(String[] args) {
        String str;

        Scanner in = new Scanner(System.in);
        str = in.next().toUpperCase(Locale.ROOT);
        in.close();

        for (int i = 0; i < str.length(); i ++ ) {
            System.out.printf("%c", 'Z' - str.charAt(i) + 'A');
        }
    }
}
