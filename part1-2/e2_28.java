package org.example;

import java.util.Scanner;

public class e2_28 {
    public static void main(String args[]) {
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
        System.out.println();
        for (int i = 0; i < size - 3; i ++ ) {
            System.out.println("#           #");
        }
        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }

        System.out.println();

        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
        System.out.println();
        for (int i = 0; i < size - 3; i ++ ) {
            for (int j = 0; j <= i; j ++ ) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }

        System.out.println();

        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
        System.out.println();
        for (int i = 0; i < size - 3; i ++ ) {
            for (int j = 0; j <= size - 4 - i; j ++ ) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }

        System.out.println();

        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
        System.out.println();
        for (int i = 0; i < size - 3; i ++ ) {
            for (int j = 0; j <= size - 4 - i; j ++ ) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }

        System.out.println();

        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
        System.out.println();
        for (int i = 0; i < size - 3; i ++ ) {
            for (int j = 0; j < size - 1; j++) {
                if (i + 1 == j) {
                    System.out.print("#" + " ");
                } else if (i + j == size - 3) {
                    System.out.print("#" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }

        System.out.println();

        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
        System.out.println();
        for (int i = 0; i < size - 3; i ++ ) {
            for (int j = 0; j < size - 1; j++) {
                if (i + 1 == j) {
                    System.out.print("#" + " ");
                } else if (i + j == size - 3) {
                    System.out.print("#" + " ");
                } else if (j == 0 || j == size - 2){
                    System.out.print("#" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size - 1; i ++ ) {
            System.out.print("#" + " ") ;
        }
    }
}
