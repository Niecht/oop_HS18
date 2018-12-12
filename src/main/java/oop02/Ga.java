package oop02;
/**
 * Write a description of class Ga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ga extends AbstractElement
{
    /**
     * Constructor for objects of class Ga
     */
    public Ga()
    {
        // initialise instance variables
        super( "Ga", 29.76f, 2400f );
    }

    public static void main(String[] args) {
        Ga ga = new Ga();
        Au au = new Au();
        System.out.println(ga.getName());
        System.out.println(ga.getTempM());
        Temperatur temp1 = new Temperatur(30f);
        System.out.println(ga.getPhase(temp1));
        System.out.println(au.getName());
        System.out.println(au.getTempM());
        System.out.println(au.getPhase(temp1));
    }
}
