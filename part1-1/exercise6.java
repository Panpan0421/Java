package org.example;

public class exercise6 {
    public static void main(String[] agrs) {
        final int a = 9;
        final int b = 899;
        int sum = 0;
        int number = a;
        while (number <= 899) {
            sum = sum + number;
            ++number;
        }
        System.out.println("The sum from " + a + " to " + b + " is " + sum);
    }
}
