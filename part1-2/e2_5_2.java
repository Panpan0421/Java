package org.example;

public class e2_5_2 {
    public static void main(String[] args) {
        int num = 1;

        int sum = 0;
        do {
            sum += num;
            num ++ ;
        } while (num <= 100);
        double avg = (double)sum/ 100;
        System.out.println("1~100的和为" + sum);
        System.out.println("平均值为" + avg);
    }
}
