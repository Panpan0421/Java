package org.example;

import java.util.Scanner;

public class e2_44 {
    public static void main(String[] args) {
        String str;
        int radix;
        int flag = 0;
        int sum = 0;
        int cnt = 0;

        Scanner in = new Scanner(System.in);
        radix = in.nextInt();
        str = in.next();
        in.close();

        for (int i = str.length() - 1; i >= 0; i -- ) {
            if (str.charAt(i) >= '0' && str.charAt(i) < (radix + '0')) {
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
        } else {
            System.out.println("Invalid");
        }
    }
}
