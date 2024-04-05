package org.example;

public class e2_7 {
    public static void main(String[] args) {
        double suml_r = 0;
        double sumr_l = 0;
        int n = 50000;

        for (int i = 1; i <= n; i ++ ) {
            suml_r += (double)1 / i;
        }
        for (int i = n; i >= 1; i -- ) {
            sumr_l += (double)1 / i;
        }
        System.out.println("从左到右的总和是" + suml_r);
        System.out.println("从右到左的总和是" + sumr_l);

        double diff;
        if (suml_r > sumr_l) {
            diff = suml_r - sumr_l;
            System.out.println("从左到右总和多" + diff);
        } else if (suml_r < sumr_l){
            diff = sumr_l - suml_r;
            System.out.println("从右到左总和多" + diff);
        } else {
            System.out.println("没有区别");
        }

    }
}
