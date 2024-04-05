package org.example;

import java.util.Scanner;

public class e2_48 {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        String str;

        Scanner in = new Scanner(System.in);
        str = in.next();

        for (int i = 0; i < str.length(); i ++ ) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.print(HEX_BITS[str.charAt(i) - '0'] + " ");
            } else {
                System.out.print(HEX_BITS[str.charAt(i) - 'a' + 10] + " ");
            }
        }
    }
}
