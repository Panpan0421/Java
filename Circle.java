package org.example;

public class Circle extends Shape {
    private double r;

    public Circle() {
        this.r = 1.0;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public String toString() {
        return "A Circle with radius=" + r + ", which is a subclass of " + super.toString();
    }
}
