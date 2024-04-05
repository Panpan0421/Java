package org.example;

public class e2_6 {
    public static void main(String[] args) {
        long product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 13;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i ++ ) {
            product *= i;
        }
        System.out.println(product);
    }
}
