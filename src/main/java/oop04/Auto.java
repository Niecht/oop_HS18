package oop04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * This class defines a car.
 *
 * @author Sven
 * @version 11.20.2018
 */
public class Auto implements Switchable, PropertyChangeListener
{
    // instance variables - replace the example below with your own
    private boolean running;
    private static final Logger LOG = LogManager.getLogger(Auto.class);
    Motor v8;
    Lamp lampLeft;
    Lamp lampRight;

    /**
     * Constructor for objects of class Auto
     */
    public Auto()
    {
        // initialise instance variables
        this.running = false;
        this.v8 = new Motor();
        this.lampLeft = new Lamp();
        this.lampRight = new Lamp();

        // Registrieren der Listener
        this.v8.addPropertyChangeListener(this);
    }

    /**
     * Switch status of the car to running
     */
    @Override
    public void switchOn()
    {
        if ( this.running == false)
        {
            this.running = true;
            this.v8.switchOn();
        } else {
            LOG.error("Car is already running");
        }
    }

    @Override
    public void switchOff()
    {
        if ( this.running == true)
        {
            this.running = false;
            this.v8.switchOff();
        } else {
            LOG.error("Car is already off");
        }
    }

    @Override
    public boolean isSwitchedOn()
    {
        return this.running;
    }

    @Override
    public boolean isSwitchedOff()
    {
        return !this.running;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent evt) {
        System.out.println(evt);
    }
}
