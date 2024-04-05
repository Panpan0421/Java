package org.example;

public class exercise4 {
    public static void main(String[] args) {
        double r = 1, h = 2, pi = 3.14;
        double s1 = 2 * pi * r * h;
        double s2 = pi * r * r;
        double v = pi * r * r * h;
        System.out.printf("圆柱体的表面积为：");
        System.out.println(s1);
        System.out.printf("圆柱体的底面积为：");
        System.out.println(s2);
        System.out.printf("圆柱体的体积为：");
        System.out.println(v);
    }
}
