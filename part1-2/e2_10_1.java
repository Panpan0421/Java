package org.example;

public class e2_10_1 {
    public static void main(String[] args) {
        int fn_1 = 1, fn_2 = 1, fn_3 = 2;
        int fn;
        int n = 20;
        int sum = 0;

        if (n == 1) {
            System.out.print(fn_2 + " ");
            sum = fn_1;
        } else if (n == 2) {
            System.out.print(fn_1 + " " + fn_2 + " ");
            sum = fn_1 + fn_2;
        } else if (n == 3) {
            System.out.print(fn_1 + " " + fn_2 + " " + fn_3 + " ");
            sum = fn_1 + fn_2 + fn_3;
        } else {
            sum = fn_1 + fn_2 + fn_3;
            int i = 4;
            System.out.print(fn_1 + " " + fn_2 + " ");
            while (i <= n) {
                fn = fn_1 + fn_2 + fn_3;
                sum += fn;
                System.out.print(fn + " ");
                fn_1 = fn_2;
                fn_2 = fn_3;
                fn_3 = fn;
                i ++ ;
            }
        }
        System.out.println();
        System.out.println((double)sum / n);
    }
}
