package oop.shapes1;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private Point centerPoint;
    public static int countRectangle = 0;

    public Rectangle(double width, double height, Point centerPoint) {
        this.width = width;
        this.height = height;
        this.centerPoint = centerPoint;
        countRectangle++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public int getCount() {
        return countRectangle;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle["
                + "Width=" + width
                + ",Height=" + height
                + ",Area=" + getArea()
                + ",Perimeter=" + getPerimeter() + "]";
    }
}
