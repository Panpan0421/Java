package org.example;

public class e2_5_3 {
    public static void main(String[] args) {
        int upperBound = 100;

        int sum = 0;
        for (int i = 1; i <= upperBound; i ++ ) {
            sum += i * i;
        }
        System.out.println("和为" + sum);
    }
}
