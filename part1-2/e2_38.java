package org.example;

import java.util.Locale;
import java.util.Scanner;

public class e2_38 {
    public static void main(String[] args) {
        String str;
        int flag = 0;

        Scanner in = new Scanner(System.in);
        str = in.next().toUpperCase(Locale.ROOT);
        in.close();

        int i = 0, j = str.length() - 1;
        while (i < j) {
            char c1 = str.charAt(i), c2 = str.charAt(j);
            if (!(c1 >= 'A' && c1 <= 'Z')) {
                break;
            }
            if (!(c2 >= 'A' && c2 <= 'Z')) {
                break;
            }
            if (c1 == c2) {
                flag = 1;
                i ++ ;
                j -- ;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }
}
