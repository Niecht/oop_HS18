package oop03;
/**
 * Write a description of class MaxMin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxMin
{
    // instance variables - replace the example below with your own
    private int zahl1;
    private int zahl2;

    /**
     * Constructor for objects of class MaxMin
     */
    public MaxMin()
    {
        // initialise instance variables
        zahl1 = 0;
        zahl2 = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int max(int zahl1, int zahl2)
    {
        if ( zahl1 > zahl2 )
        {
            return zahl1;
        } else {
            return zahl2;
        }
    }

    public int min( final int zahl1, final int zahl2 )
    {
        if ( zahl1 > zahl2 )
        {
            return zahl2;
        } else {
            return zahl1;
        }
    }

    public int max1( final int zahl1, final int zahl2, final int zahl3 )
    {
        int max = this.max( zahl1, zahl2 );
        max = this.max( max, zahl3 );
        return max;
    }

    public int maxIf( final int zahl1, final int zahl2, final int zahl3 )
    {
        if ( zahl1 > zahl2 && zahl1 > zahl3)
        {
            return zahl1;
        }
        if ( zahl2 > zahl1 && zahl2 > zahl3)
        {
            return zahl2;
        }
        return zahl3;
    }

    public int maxElse( final int zahl1, final int zahl2, final int zahl3 )
    {
        if ( zahl1 > zahl2 && zahl1 > zahl3 )
        {
            return zahl1;
        } else if ( zahl2 > zahl1 && zahl2 > zahl3 )
        {
            return zahl2;
        } else {
            return zahl3;
        }
    }

}
