package org.example;

public class exercise11 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000)
        {
            if ((i % 3 == 0 || i % 5 == 0 || i % 7 == 0) && !(i % 15 == 0 || i % 21 == 0 || i % 35 == 0 || i % 105 == 0))
                System.out.println(i);
            i ++ ;
        }
    }
}
