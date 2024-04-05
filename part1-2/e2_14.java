package org.example;

import java.util.Scanner;

public class e2_14 {
    public static void main(String[] args) {
        double r, d, cir, area;

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        in.close();

        d = 2 * r;
        cir = 2 * Math.PI * r;
        area = Math.PI * r * r;

        System.out.printf("%.2f %.2f %.2f", d, cir, area);
    }
}
