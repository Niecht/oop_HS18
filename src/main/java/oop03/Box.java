
/**
 * Write a description of class Box here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Box
{
    // instance variables - replace the example below with your own
    private int height;
    private int with;

    /**
     * Constructor for objects of class Box
     */
    public Box(int newHeight, int newWith)
    {
        // initialise instance variables
        height = newHeight;
        with = newWith;
    }

    public void printBox()
    {
        for ( int i = this.height ; i >= 1 ; i-- )
        {
            if ( i == this.height || i == 1 )
            {
                this.printLine();
            } else {
                this.printWall();
            }
        }
    }

    private void printLine()
    {
        for ( int i = this.with ; i >= 1 ; i-- )
        {
            System.out.printf("#");
        }
        System.out.println ();
    }

    private void printWall()
    {
        for ( int i = this.with ; i >= 1 ; i-- )
        {
            if ( i == this.with || i <= 1)
            {
                System.out.printf("#");
            } else {
                System.out.printf(" ");
            }
        }
    }
    /* 
     * Schöne lösung mit kompakter schleife
     * for ( int i = 1 ; 1 <= height ; i++ )
     *  for (int j = 1 ; 1 <= width ; j++)
     *    if( i == 1 || j == 1 || i == height || j == width)
     *      sys.out.printf("#")
     *     else 
     *      sys.out.printf(" ")
     *      
     */
    
}
