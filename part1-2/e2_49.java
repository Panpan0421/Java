package org.example;

import java.util.Scanner;

public class e2_49 {
    public static void main(String[] args) {
        int num;
        int radix = 16;
        final char[] HEX_CHARS = {'0','1','2','3', '4','5','6','7', '8','9','A','B', 'C','D','E','F'};
        String hexStr = " ";

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();

        while (num > 0) {
            int n = num % radix;
            hexStr = HEX_CHARS[n] + hexStr;
            num = num / radix;
        }
        System.out.println(hexStr);
    }
}
