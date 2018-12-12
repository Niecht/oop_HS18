package oop02;
/**
 * Write a description of class U here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U extends AbstractElement
{
    /**
     * Constructor for objects of class U
     */
    public U()
    {
        // initialise instance variables
        super( "U", 1133f, 3930f);
    }

    public static void main(String[] args) {
        U uranium = new U();
        System.out.println(uranium.toString());
    }
    @Override
    public String toString(){
        return super.toString() + " radioactive!!!";
    }
}
