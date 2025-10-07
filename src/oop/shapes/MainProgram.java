package oop.shapes;

import java.util.ArrayList;

public class MainProgram {
    public static class listShapes {
        ArrayList<Shape> shapes = new ArrayList<>();
        public void addShape(Shape shape){
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
        listShapes listShapes = new listShapes();
        Circle circle = new Circle(new Point(3.5, 6.0), 25.0);
        Rectangle rectangle = new Rectangle(new Point(5.0, 10.0), 2.0, 3.0);
        Square square = new Square(new Point(10.0, 15.0), 5.0);
        listShapes.addShape(circle);
        listShapes.addShape(rectangle);
        listShapes.addShape(square);
        System.out.println("ShapeCount: " + Shape.getShapeCount());
        listShapes.printShapes();
        listShapes.printCenterPoints();
    }
}
