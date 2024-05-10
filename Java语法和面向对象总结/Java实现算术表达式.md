# Java实现算术表达式

```Java
package org.example;

import java.util.*;

public class TestMain {
    static Stack<Integer> num = new Stack<>();
    static Stack<Character> op = new Stack<>();

    public static void eval() {
        int b = num.pop();
        int a = num.pop();
        char c = op.pop();
        int x;
        if (c == '+') x = a + b;
        else if (c == '-') x = a - b;
        else if (c == '*') x = a * b;
        else x = a / b;
        num.push(x);
    }

    public static void main(String[] args) {
        //定义算术运算符的优先级
        HashMap<Character, Integer> pr = new HashMap<>();
        pr.put('+', 1);
        pr.put('-', 1);
        pr.put('*', 2);
        pr.put('/', 2);

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i ++ ) {
            char c = str.charAt(i);
            //判断是否为数字，将相邻的数字转化为整数进行转化
            if (Character.isDigit(c)) {
                int x = 0;
                int j = i;
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    x = x * 10 + str.charAt(j) -'0';
                    j++;
                }
                i = j - 1;
                num.push(x);
            } else if (c == '(') {
                op.push(c);
            } else if (c == ')') {
                while (op.peek() != '(') eval();//将括号内的所有内容进依次进行运算
                op.pop();
            } else {
                while (!op.isEmpty() && op.peek() != '(' && pr.get(op.peek()) >= pr.get(c)) eval();//栈顶不为'(':需要等')'出现，然后一起将括号内所有数据进行运算；当前运算符的优先级一定要小于栈顶，栈顶的运算符才可进行运算
                op.push(c);
            }
        }
        while (!op.isEmpty()) eval();

        System.out.println(num.peek());
    }
}

```