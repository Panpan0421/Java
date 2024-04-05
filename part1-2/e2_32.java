package org.example;

import java.util.Scanner;

public class e2_32 {
    public static void main(String[] args) {
        String inStr;
        int inStrlen;

        Scanner in = new Scanner(System.in);
        inStr = in.next();
        in.close();
        inStrlen = inStr.length();

        for (int i = inStrlen - 1; i >= 0; i -- ) {
            System.out.print(inStr.charAt(i));
        }
    }
}
