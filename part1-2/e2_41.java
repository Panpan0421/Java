package org.example;

import java.util.Scanner;

public class e2_41 {
    public static void main(String[] args) {
        String str;
        int flag = 0;
        int radix = 2;
        int sum = 0;
        int cnt = 0;

        Scanner in = new Scanner(System.in);
        str = in.next();
        in.close();

        for (int i = str.length() - 1; i >= 0; i -- ) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '1') {
                flag = 1;
                sum += (str.charAt(i) - '0') * Math.pow(radix, cnt);
                cnt ++ ;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(sum);
            System.out.println("is a binary string");
        } else {
            System.out.println("is not a binary string");
        }
    }
}
