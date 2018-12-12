package oop04;
/**
 * Draws a line between two points.
 *
 * @author Sven
 * @version 15.10.2018
 */
public class Line
{
    // instance variables - replace the example below with your own
    private Point point1;
    private Point point2;

    /**
     * Constructor for objects of class Line
     */
    public Line()
    {
        point1 = new Point(1,2);
        point2 = new Point(30,40);
    }

    /**
     * Returns the coordinates of point 1
     * @return    coordinates of point 1
     */
    public Point getPoint1()
    {
        // put your code here
        return point1;
    }

    public Point getPoint2()
    {
        return point2;
    }
    
    public void setP1( int newX, int newY )
    {
        point1.changeXY( newX, newY);
    }
}
