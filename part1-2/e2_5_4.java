package org.example;

public class e2_5_4 {
    public static void main(String[] args) {
        int sumOdd = 0, sumEven = 0;
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 1) {
                sumOdd += num;
            } else {
                sumEven += num;
            }
            num ++ ;
        }

        int diff = sumOdd - sumEven;
        diff = (sumOdd > sumEven) ? diff : -diff;

        System.out.println("奇数和为" + sumOdd + "，" + "偶数和为" + sumEven);
        System.out.println("它们之间的差为" + diff);
    }
}
