package org.example;

public class e2_9 {
    public static void main(String[] args) {
        final int LOWERBOUND = 1, UPPERBOUND = 110;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i ++ ) {
            if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print("Coza ");
            } if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0) {
                System.out.print("Loza ");
            } if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0) {
                System.out.print("Woza ");
            } if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0) {
                System.out.print("CozaLoza ");
            } if (i % 3 == 0 && i % 5 != 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("LozaWoza ");
            } if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            } if (i % 11 == 0) {
                System.out.println();
            }
        }
    }
}
