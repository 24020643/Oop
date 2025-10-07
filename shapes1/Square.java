package oop.shapes1;

public class Square implements Shape{
    private double side;
    private Point centerPoint;
    public static int countSquare = 0;

    public Square(double side, Point centerPoint) {
        this.side = side;
        this.centerPoint = centerPoint;
        countSquare++;
    }

    public int getCount() {
        return countSquare;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square["
                + "Side=" + side
                + ",Area=" + getArea()
                + ",Perimeter=" + getPerimeter() + "]";
    }
}
