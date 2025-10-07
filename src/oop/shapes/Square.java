package oop.shapes;

public class Square extends Rectangle {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square["
                + "Side=" + side
                + ",Area=" + getArea()
                + ",Perimeter=" + getPerimeter() + "]";
    }
}