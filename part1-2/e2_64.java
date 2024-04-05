package org.example;

public class e2_64 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {4, 5}};
        int[][] matrix2 = {{7, 8}, {10, 11}};

        double[][] matrix3 = {{0.5, 1.5}, {2.5, 3.5}};
        double[][] matrix4 = {{1.5, 2.5}, {3.5, 4.5}};

        int[][] resultIntAdd = add(matrix1, matrix2);
        print(resultIntAdd);

        double[][] resultDoubleAdd = add(matrix3, matrix4);
        print(resultDoubleAdd);

        int[][] resultIntSubtract = subtract(matrix1, matrix2);
        print(resultIntSubtract);

        double[][] resultDoubleSubtract = subtract(matrix3, matrix4);
        print(resultDoubleSubtract);

        int[][] resultIntMultiply = multiply(matrix1, matrix2);
        print(resultIntMultiply);

        double[][] resultDoubleMultiply = multiply(matrix3, matrix4);
        print(resultDoubleMultiply);
    }

    public static void print(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] array) {
        for (double[] i : array) {
            for (double j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static boolean sameAs(int[][] arr1, int[][] arr2) {
        return arr1.length == arr2.length && arr1[0].length == arr2[0].length;
    }

    public static boolean sameAs(double[][] arr1, double[][] arr2) {
        return arr1.length == arr2.length && arr1[0].length == arr2[0].length;
    }

    public static int[][] add(int[][] arr1, int[][] arr2) {
        if (!sameAs(arr1, arr2)) {
            throw new IllegalArgumentException("无法相加，大小不一致");
        }

        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return ans;
    }

    public static double[][] add(double[][] arr1, double[][] arr2) {
        if (!sameAs(arr1, arr2)) {
            throw new IllegalArgumentException("无法相加，大小不一致");
        }

        int rows = arr1.length;
        int cols = arr1[0].length;
        double[][] ans = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return ans;

    }

    public static int[][] subtract(int[][] arr1, int[][] arr2) {
        if (!sameAs(arr1, arr2)) {
            throw new IllegalArgumentException("无法相减，大小不一致");
        }

        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        return ans;
    }

    public static double[][] subtract(double[][] arr1, double[][] arr2) {
        if (!sameAs(arr1, arr2)) {
            throw new IllegalArgumentException("无法相减，大小不一致");
        }

        int rows = arr1.length;
        int cols = arr1[0].length;
        double[][] ans = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        return ans;
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        if (arr1[0].length != arr2.length) {
            throw new IllegalArgumentException("两数组大小不匹配，无法相乘");
        }

        int rows = arr1.length;
        int cols = arr2[0].length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return ans;
    }

    public static double[][] multiply(double[][] arr1, double[][] arr2) {
        if (arr1[0].length != arr2.length) {
            throw new IllegalArgumentException("两数组大小不匹配，无法相乘");
        }

        int rows = arr1.length;
        int cols = arr2[0].length;
        double[][] ans = new double[rows][cols];

        for (int i = 0; i < rows; i ++ ) {
            for (int j = 0; j < cols; j ++ ) {
                for (int k = 0; k < arr1[0].length; k ++ ) {
                    ans[i][j] = arr1[i][k] * arr2[k][j];
                }
            }
        }

        return ans;
    }
}

