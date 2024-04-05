package org.example;

public class e2_8 {
    public static void main(String[] args) {
        double sum = 0;
        final int MAX_DENOMINATOR = 1000;

        for (int i = 1; i <= MAX_DENOMINATOR; i += 2) {
            if (i % 4 == 1) {
                sum += 4 * (double)1 / i;
            } else if (i % 4 ==  3) {
                sum -= 4 * (double)1 / i;
            } else {
                System.out.println("不可能");
            }
        }
        System.out.println(sum);
    }
}
