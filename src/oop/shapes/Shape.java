package oop.shapes;

public abstract class Shape {
    protected Point centerPoint;
    private static int shapeCount = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        shapeCount++;
    }

    public static int getShapeCount() {
        return shapeCount;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Center: " + centerPoint;
    }

    public static class Demo {
        public static void main(String[] args) {

        }
    }
}
