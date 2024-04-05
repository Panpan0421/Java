package org.example;

import java.util.Scanner;

public class e2_17 {
    public static void main(String[] args) {
        final double END = -1.0;
        double salary;

        Scanner in = new Scanner(System.in);
        salary = in.nextDouble();

        while (salary != END) {
            double tax;
            if (salary <= 20000) {
                System.out.println(0);
                tax = 0;
                if (tax < 10000) {
                    System.out.println(tax * 0.1);
                } else {
                    System.out.println(1000);
                }
            } else if (salary <= 40000) {
                tax = 0.1 * (salary - 20000);
                System.out.println(tax);
                if (tax < 10000) {
                    System.out.println(tax * 0.1);
                } else {
                    System.out.println(1000);
                }
            } else if (salary <= 60000) {
                tax = 2000 + 0.2 * (salary - 40000);
                System.out.println(tax);
                if (tax < 10000) {
                    System.out.println(tax * 0.1);
                } else {
                    System.out.println(1000);
                }
            } else {
                tax = 2000 + 4000 + 0.3 * (salary - 60000);
                System.out.println(tax);
                if (tax < 10000) {
                    System.out.println(tax * 0.1);
                } else {
                    System.out.println(1000);
                }
            }

            salary = in.nextDouble();
        }
    }
}
