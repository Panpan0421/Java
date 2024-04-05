package org.example;

public class MyIntStack {
    private int[] contents;
    private int top;

    public MyIntStack(int capacity) {
        contents = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        contents[ ++ top] = element;
    }

    public int pop() {
        return contents[top -- ];
    }

    public int peek() {
        return contents[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == contents.length - 1;
    }
}
