package org.example;

public class e2_5_1 {
    public static void main(String[] args) {
        int upperBound = 100;

        int sum = 0;
        for (int i = 1; i <= upperBound; i ++ ) {
            sum += i;
        }
        double avg = (double)sum / upperBound;
        System.out.println("1~100的和为" + sum);
        System.out.println("平均值为" + avg);
    }
}
