package oop04;
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    // x and y coordinates of a point
    private int x;
    private int y;

    /**
     * Creatse a pont object with x and y coordinates.
     */
    public Point(int newX, int newY)
    {
        // initialise instance variables
        x = newX;
        y = newY;
    }

    public Point(Point point)
    {
        this(point.getX(), point.getY());
    }

    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.moveRelative(1,3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        Point p2 = new Point(5,6);
        p1.moveRelative(p2);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
    }
    /**
     * prints out in which Quadrant the the point is located
     */
    public int getQuadrant()
    {
        if ( x == 0 && y == 0 )
        {
            System.out.println ( " The point is on the zero point" );
            return 0;
        } else if ( x == 0 ) {
            System.out.println ( " The point is on the X axis" );
        } else if ( y == 0 ) {
            System.out.println ( " The point is on the Y axis" );
        }
        if ( x > 0)
        {
            if ( y > 0 )
            {
                return 1;
            } else {
                return 4;
            }
        } else if ( y > 0 ) {
            return 2;
        } else {
            return 3;
        }
    }

    public void changeXY( int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }

    public void moveRelative(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point)
    {
        this.x = this.x + point.getX();
        this.y = this.y + point.getY();
    }

    public void moveRelative(double angle, int radius)
    {
        this.x = (int) (radius * Math.cos(angle));
        this.y = (int) (radius * Math.sin(angle));
    }
}
