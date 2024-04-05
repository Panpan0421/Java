package org.example;

import java.util.Scanner;

public class e2_47 {
    public static void main(String[] args) {
        final int NUM;

        Scanner in = new Scanner(System.in);
        NUM = in.nextInt();
        int[] students = new int[NUM];

        for (int i = 0; i < NUM; i ++ ) {
            students[i] = in.nextInt();
        }

        int sum = 0;
        int Max = 0;
        int Min = 1000000;
        for (int i = 0; i < NUM; i ++ ) {
            sum += students[i];
            if (students[i] > Max) {
                Max = students[i];
            }
            if (students[i] < Min) {
                Min = students[i];
            }
        }
        double avg = (double)sum / NUM;

        System.out.printf("%.2f %d %d", avg, Min, Max);
    }
}
