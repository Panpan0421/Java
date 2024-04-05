package org.example;


public class e2_61 {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The standard deviation is " + stdDev(grades));
    }

    public static void readGrades() {
        grades = new int[]{50, 51, 56, 53};
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i ++ ) {
            System.out.print(array[i] + " ");
        }
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i ++ ) {
            sum += array[i];
        }

        return (double)sum / array.length;
    }

    public static double median(int[] array) {
        for (int i = 0; i < grades.length - 1; i ++ ) {
            for (int j = 0; j < grades.length - i - 1; j ++ ) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        if (grades.length % 2 == 1) {
            return grades[grades.length / 2];
        } else {
            return (grades[grades.length / 2] + grades[grades.length / 2 - 1]) / 2;
        }
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i ++ ) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i ++ ) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static double stdDev(int[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i ++ ) {
            sum += array[i] * array[i] - average(grades) * average(grades);
        }
        return Math.sqrt(sum / array.length);
    }
}
