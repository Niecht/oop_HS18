package oop05;
/**
 * Abstract class that defines a Shape
 * @author Sven
 * @version 10.15.2018
 */
public abstract class Shape
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    protected Shape( int x, int y )
    {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public final void move(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public abstract int getPerimeter();

    public abstract int getArea();
}
