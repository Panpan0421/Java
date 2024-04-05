package org.example;

public class exercise5 {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.println("The sum, difference, product, quotient and remainder of " + number1 + " and " + number2 + " are " + sum + ", " + difference + ", " + product + ", " + quotient + ", and " + remainder);

        ++number1;
        --number2;
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2;
        System.out.println("The new quotient of " + number1 + " and " + number2
                + " is " + quotient);

        int sum1 = 31 * number1 + 17 * number2;
        System.out.printf("31个number1和17个number2的和为");
        System.out.println(sum1);

        int number3 = 77;
        int sum2 = number1 + number2 + number3, product2 = number1 * number2 * number3;
        System.out.println("三个数的和为" + sum2 + "，" + "三个数的乘积为" + product2);
    }
}
