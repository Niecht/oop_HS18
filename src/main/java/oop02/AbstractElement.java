package oop02;
/**
 * This class defines an abstract element of the preiodic table.
 *
 * @author Sven Guggisberg
 * @version 1.1
 */
public abstract class AbstractElement
{
    // Name of the Element
    private String name;
    //Melting temperature
    private float tempM;
    //Boiling temperature
    private float tempB;

    /**
     * Constructor for objects of class AbstractElement with defined name, melting temperature and boiling temperature in °C.
     * @param newName The name of the element.
     * @param newTempM The melting temperature of the element in °C.
     * @param newTempB The boiling temperature of the element in °C.
     */
    public AbstractElement( String newName, float newTempM, float newTempB)
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
    
    public String getPhase(Temperatur temperatur)
    {
        float temperaturC = temperatur.getDegCelsius();
         if ( temperaturC>= this.getTempB() ) 
        {
            return "Gas";
        } else if ( temperaturC >= this.getTempM() )
        {
            return "Liquid";
        } else {
            return "Solid";
        }
    }

}
