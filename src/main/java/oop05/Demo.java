package oop05;

public class Demo {
    public static void main(String[] args) {
        Shape shape1 = new Circle(1,3,5);
        Shape shape2 = new Rectangle(6,3,2,7);
        shape1.move(2,6);
        shape2.move(12,6);
        System.out.println(shape1.getX());
        System.out.println(((Circle) shape1).getDiameter());
    }
}
