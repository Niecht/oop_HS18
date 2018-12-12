package oop05;
import java.lang.Math;
/**
 * Defines the Object Circle.
 *
 * @author Sven
 * @version 10.15.2018
 */
public class Circle extends Shape
{
    // instance variables - replace the example below with your own
    private int diameter;

    /**
     * Constructor for objects of class Circle
     */
    public Circle( int x, int y, int diameter)
    {
        super( x, y);
        this.diameter = diameter;
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(1,3,5);
        Shape shape2 = new Rectangle(6,3,2,7);
        shape1.move(2,6);
        shape2.move(12,6);
        System.out.println(shape1.getX());
        System.out.println(((Circle) shape1).getDiameter());

//        Circle kreis = new Circle(2,3,5);
//        System.out.println(kreis.getDiameter());
//        System.out.println(kreis.getArea());
//        System.out.println(kreis.getPerimeter());
//        kreis.setDiameter(10);
//        System.out.println(kreis.getDiameter());
//        Rectangle rect = new Rectangle(2,2,5,10);
//        System.out.println(rect.getX());
    }
    /**
     * Sets the diameter of the Circle
     *
     * @param  diameter the new diamieter of the Circle
     */
    public void setDiameter(int diameter)
    {
        this.diameter = diameter;
    }

    public int getDiameter()
    {
        return diameter;
    }

    public int getPerimeter()
    {
        return (int) (diameter * Math.PI);
    }

    public int getArea()
    {
        return (int) (Math.pow((diameter / 2.0),2)* Math.PI);
    }
}
