package org.example;

import java.util.Scanner;

public class e2_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }

        int[] cnt = new int[10];
        for (int i = 0; i < grades.length; i ++ ) {
            cnt[grades[i] / 10] ++ ;
        }

        for (int i = 0; i < 10; i++) {
            int lowerBound = i * 10;
            int upperBound = i * 10 + 9;
            System.out.printf("%2d - %2d: ", lowerBound, upperBound);
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

