package oop04;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Write a description of class Lamp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lamp implements CountingSwichable
{
    // instance variables - replace the example below with your own
    private long count;
    private boolean isOn;
    private static final Logger LOG = LogManager.getLogger(Lamp.class);

    /**
     * Constructor for objects of class Lamp
     */
    public Lamp()
    {
        // initialise instance variables
        count = 0;
        isOn = false;
    }


    @Override
    public long getSwitchCount()
    {
        // put your code here
        return count;
    }
    
    @Override
    public void switchOn()
    {
        if (this.isOn == false)
        {
            this.isOn = true;
            count += 1;
        } else {
            LOG.error("Lamp is allready on");
        }
    }
    @Override
    public void switchOff()
    {
        if ( isOn == true)
        {
            isOn = false;
            count += 1;
        } else {
            LOG.error("Lamp is allready off");
        }
    }
    
    @Override
    public boolean isSwitchedOn()
    {
        return this.isOn;
    }
    
    @Override
    public boolean isSwitchedOff()
    {
        return !this.isOn;
    }
    
    
}
