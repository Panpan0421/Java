package org.example;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public double distance(int x, int y) {
        int xDelta = this.x - x;
        int yDelta = this.y - y;
        return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public double distance(MyPoint another) {
        int xDelta = this.x - another.x;
        int yDelta = this.y - another.y;
        return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
