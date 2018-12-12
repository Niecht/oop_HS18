
/**
 * Write a description of class Schweizerkreuz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Schweizerkreuz
{
    private int height;

    /**
     * Constructor for objects of class Schweizerkreuz
     */
    public Schweizerkreuz( int newHeight )
    {
        // initialise instance variables
        height = newHeight;
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
        for ( int i = this.height ; i >= 1 ; i-- )
        {
            System.out.printf("#");
        }
        System.out.println ();
    }

    private void printWall()
    {
        for ( int i = this.height ; i >= 1 ; i-- )
        {
            if ( i == this.height )
            {
                System.out.printf("#");
            } else if ( i > 1 ){
                System.out.printf(" ");
            } else {
                System.out.println("#");
            }
        }
    }
}
