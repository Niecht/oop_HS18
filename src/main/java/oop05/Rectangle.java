package oop05;
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle( int x, int y, int width, int height )
    {
        super( x, y );
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        //main method would go here
    }
    /**
     * Blabla blabla
     * @param  y  a sample parameter for a method
     */
    public void changeDimension( int newWidth, int newHeight )
    {
        this.width = newWidth;
        this.height = newHeight;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getPerimeter()
    {
        return width * 2 + height * 2;
    }
    
    public int getArea()
    {
        return width * height;
    }
}
