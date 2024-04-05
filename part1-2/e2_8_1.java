package org.example;

public class e2_8_1 {
    public static void main(String[] args) {
        double sum = 0.0;
        final int MAX_TERM = 100000000;
        final double PI = 3.141592653589793;

        int num = 1;
        for (int i = 1; i <= MAX_TERM; i ++ ) {
            if (num % 4 == 1) {
                sum += 4 * (double) 1 / num;
            } else {
                sum -= 4 * (double) 1 / num;
            }
            num += 2;
        }
        System.out.println(sum);

        double percent = sum / PI * 100;
        System.out.println("百分比为" + percent + "%");
    }
}
