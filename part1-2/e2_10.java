package org.example;

public class e2_10 {
    public static void main(String[] args) {
        int fn_1 = 1, fn_2 = 1;
        int fn;
        int n = 20;
        int sum = 0;

        if (n == 1) {
            System.out.print(fn_2 + " ");
            sum = fn_1;
        } else if (n == 2) {
            System.out.print(fn_1 + " " + fn_2 + " ");
            sum = fn_1 + fn_2;
        } else {
            sum = fn_1 + fn_2;
            int i = 3;
            System.out.print(fn_1 + " " + fn_2 + " ");
            while (i <= n) {
                fn = fn_1 + fn_2;
                sum += fn;
                System.out.print(fn + " ");
                fn_1 = fn_2;
                fn_2 = fn;
                i ++ ;
            }
        }
        System.out.println();
        System.out.println((double)sum / n);
    }
}
