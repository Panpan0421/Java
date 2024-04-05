package org.example;

public class exercise12 {
    public static void main(String[] args) {
        int year = 999;
        int cnt = 0;
        while (year <= 2010) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                System.out.println(year);
            year ++ ;
            cnt ++ ;
        }
        System.out.println(cnt);
    }
}
