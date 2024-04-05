package org.example;

import java.util.Scanner;

public class e2_18 {
    public static void main(String[] agrs) {
        final int MAXLIMIT = 6000;
        int salary, age;

        Scanner in = new Scanner(System.in);
        salary = in.nextInt();
        age = in.nextInt();

        double tax1, tax2, contribution;
        if (salary <= MAXLIMIT) {
            if (age <= 55) {
                tax1 = (double)salary * 0.2;
                tax2 = (double)salary * 0.17;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            } else if (age <= 60) {
                tax1 = (double)salary * 0.13;
                tax2 = (double)salary * 0.13;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            } else if (age <= 65) {
                tax1 = (double)salary * 0.075;
                tax2 = (double)salary * 0.09;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            } else {
                tax1 = (double)salary * 0.05;
                tax2 = (double)salary * 0.075;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            }
        } else {
            salary = 6000;
            if (age <= 55) {
                tax1 = (double)salary * 0.2;
                tax2 = (double)salary * 0.17;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            } else if (age <= 60) {
                tax1 = (double)salary * 0.13;
                tax2 = (double)salary * 0.13;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            } else if (age <= 65) {
                tax1 = (double)salary * 0.075;
                tax2 = (double)salary * 0.09;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            } else {
                tax1 = (double)salary * 0.05;
                tax2 = (double)salary * 0.075;
                contribution = tax1 + tax2;
                System.out.print(tax1 + " ");
                System.out.print(tax2 + " ");
                System.out.println(contribution);
            }
        }
    }
}
