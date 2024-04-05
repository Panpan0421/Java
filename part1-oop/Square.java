package org.example;

public class Square extends Rectangle{
    public Square(float side) {
        super(side, side);
    }

    public void setWidth(float side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
