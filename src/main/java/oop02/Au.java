package oop02;
/**
 * Write a description of class Au here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Au extends AbstractElement
{
    // instance variables - replace the example below with your own
    // Name of the Element
    private String name;
    //Melting temperature
    private float tempM;
    //Boiling temperature
    private float tempB;
    /**
     * Constructor for objects of class Au
     */
    public Au()
    {
        // initialise instance variables
        super( "Au", 1064.18f, 2970f);
    }

    public static void main(String[] args) {
        AbstractElement au = new Au();
        System.out.println(au.getName());
        System.out.println(au.getTempB());
        Temperatur temp1 = new Temperatur(3000f);
        System.out.println(au.getPhase(temp1));
    }
}
