package oop05;
/**
 * The definition of a Square.
 *
 * @author Sven
 * @version 10.16.2018
 */
public final class Square extends Shape
{
    int size;
    /**
     * Constructor for objects of class Square
     */
    public Square(int x , int y, int size)
    {
        // initialise instance variables
        super( x, y);
        this.size = size;
    }
    
    public void changeSize( int size )
    {
        this.size = size;
    }
    
    public int getSize()
    {
        return size;
    }
   
    public int getPerimeter()
    {
        return size * 4;
    }
    
    public int getArea()
    {
        return size * size;
    }
}
