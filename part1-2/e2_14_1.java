package org.example;

import java.util.Scanner;

public class e2_14_1 {
    public static void main(String[] args) {
        double r, s, v;

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        in.close();

        s = 4 * Math.PI * r * r;
        v = 4.0 / 3 * Math.PI * r * r * r;

        System.out.println(s);
        System.out.println(v);
    }
}
