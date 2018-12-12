
/**
 * Write a description of class Counter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Counter
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void coutfor()
    {
        for ( int x = 0 ; x <= 10 ; x++ )
        {
            System.out.println ( x );
        }
    }
    
    public void countwhile()
    {
        int x = 0;
        while ( x <= 10 )
        {
            System.out.println ( x );
            x += 1;
        }
    }
    
    public void countdowhile()
    {
        int x = 0;
        do {        
            System.out.println ( x );
            x += 1;
        } while ( x <= 10 );
    }
}
