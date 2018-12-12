package oop02;
/**
 * This class generatres an object that represents an element of the preiodic table.
 *
 * @author Sven Guggisberg
 * @version 1.0
 */
public class Element
{
    // instance variables - replace the example below with your own
    public String name;
    //Melting temperature
    public float tempM;
    //Boiling temperature
    public float tempB;

    /**
     * Constructor for objects of class Element with defined name, melting temperature and boiling temperature in °C.
     * @param newName The name of the element.
     * @param newTempM The melting temperature of the element in °C.
     * @param newTempB The boiling temperature of the element in °C.
     */
    public Element( String newName, float newTempM, float newTempB)
    {
        // initialise instance variables
        name = newName;
        tempM = newTempM;
        tempB = newTempB;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public float getTempM()
    {
        return this.tempM;
    }
    
    public float getTempB()
    {
        return this.tempB;
    }
}
