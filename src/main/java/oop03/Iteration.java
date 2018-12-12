
/**
 * Write a description of class Iteration here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Iteration
{
    // instance variables - replace the example below with your own
    private float start;
    private float adder;

    /**
     * Constructor for objects of class Iteration
     */
    public Iteration()
    {
        // initialise instance variables
        start = 0.9f;
        adder = 0.000025f;
    }

    public void iteratrion()
    {
        // put your code here
        float number = start;
        int counter = 0;
        while ( number <= 1f )
        {
            number += adder;
            counter += 1;
        }
        System.out.println ( "number = " + number + " counter = " + counter );
    }
    
    public float foriteration()
    {
        float number = start;
        for ( int i = 0; i <= 4000 ; i++ )
        {
            number += adder;
        }
        return number;
    }
}
