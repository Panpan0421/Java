package org.example;

public class exercise8 {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = 7;
        while (number <= UPPERBOUND) {
            sum = sum + number;
            number = number + 7;
        }
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}
