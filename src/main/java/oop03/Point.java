
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for default object of class Point
     */
    public Point(int newX, int newY)
    {
        // initialise instance variables
        x = newX;
        y = newY;
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
}
