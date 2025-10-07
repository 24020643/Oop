package oop.shapes1;

import java.util.ArrayList;

public class MainProgram {
    public static class listShapes {
        ArrayList<Shape> shapes = new ArrayList<>();
        public void addShape(Shape shape) {
            shapes.add(shape);
        }
        public void printShapes(){
            for (Shape shape : shapes){
                System.out.println(shape.toString());
            }
        }
        public void printCenterPoints() {
            for (Shape shape : shapes){
                System.out.println(shape.getCenterPoint().toString());
            }
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, new Point(2.0, 2.0));
        Rectangle rectangle = new Rectangle(5.0, 10.0, new Point(0.0, 0.0));
        Square square = new Square(2.0, new Point(5.0, 5.0));
        listShapes listShapes = new listShapes();
        listShapes.addShape(circle);
        listShapes.addShape(rectangle);
        listShapes.addShape(square);
        System.out.println("ShapeCount: " + (circle.getCount() + rectangle.getCount() + square.getCount()));
        listShapes.printShapes();
        listShapes.printCenterPoints();
    }
}
