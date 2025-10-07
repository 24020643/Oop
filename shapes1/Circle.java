package oop.shapes1;

public class Circle implements Shape {
    private double radius;
    private Point centerPoint;
    public static final double PI = 3.14;
    public static int countCircle = 0;

    public Circle(double radius,  Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
        countCircle++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return radius * radius * PI;
    }

    public int getCount() {
        return countCircle;
    }

    @Override
    public String toString() {
        return "Circle["
                + "Radius=" + radius
                + ",Area=" + getArea()
                + ",Perimeter" + getPerimeter() + "]";
    }
}
