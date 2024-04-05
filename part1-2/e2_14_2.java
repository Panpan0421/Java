package org.example;

import java.util.Scanner;

public class e2_14_2 {
    public static void main(String[] args) {
        double r, h, baseArea, s, v;

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        h = in.nextDouble();
        in.close();

        baseArea = Math.PI * r * r;
        s = 2 * baseArea + 2 * Math.PI * r * h;
        v = baseArea * h;

        System.out.println(baseArea);
        System.out.println(s);
        System.out.println(v);
    }
}
