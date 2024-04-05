package org.example;

import java.util.Locale;
import java.util.Scanner;

public class e2_33 {
    public static void main(String[] args) {
        String str;
        int vowelNum = 0;
        int digitNum = 0;

        Scanner in = new Scanner(System.in);
        str = in.next().toLowerCase(Locale.ROOT);
        in.close();

        for (int i = 0; i < str.length(); i ++ ) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelNum ++ ;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digitNum++;
            }
        }

        System.out.println(vowelNum + " " + (double)vowelNum / str.length() * 100 + "%");
        System.out.println(digitNum + " " + (double)digitNum / str.length() * 100 + "%");
    }
}
