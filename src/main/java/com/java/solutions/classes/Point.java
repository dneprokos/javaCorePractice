package com.java.solutions.classes;

public class Point {
    private int x;
    private int y;

    public Point() { }

    public Point(int x, int y) {
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

    public double distance(){
        var point = new Point(0, 0);
        return distance(point);
    }

    public double distance(int x, int y){
        var point = new Point(x, y);
        return distance(point);
    }

    public double distance(Point another){
        return Math.sqrt(
                (another.getX() - this.x) * (another.getX() - this.x)
                        + (another.getY() - this.y) * (another.getY() - this.y));
    }
}
