package oop02;
/**
 * Write a description of class N here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class N extends AbstractElement
{
    // instance variables - replace the example below with your own
    // Name of the Element
    private String name;
    //Melting temperature
    private float tempM;
    //Boiling temperature
    private float tempB;
    /**
     * Constructor for objects of class N
     */
    public N()
    {
        // initialise instance variables
        super( "N", -210.1f, -196f);
    }
}
