package org.example;

import java.util.Scanner;

public class e2_69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        int num = in.nextInt();

        System.out.println(specialSeries(x, num));
    }

    public static double formula (double x, int num) {
        int m1 = 1, m2 = 1;

        for (int i = 1; i < num; i = i + 2) {
            m1 *= i;
        }
        for (int i = 2; i < num; i = i + 2) {
            m2 *= i;
        }

        return (double)m1 / m2 * Math.pow(x, num) / num;
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        for (int i = 1; i <= numTerms; i = i + 2) {
            sum += formula(x, i);
        }

        return sum;
    }
}
