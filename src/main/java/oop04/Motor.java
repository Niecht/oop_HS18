package oop04;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Motor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motor implements Switchable
{
    // instance variables - replace the example below with your own
    private int rpm;
    private boolean running;
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    /**
     * Constructor for objects of class Motor
     */
    public Motor()
    {
        // initialise instance variables
        rpm = 0;
        running = false;
    }

    @Override
    public void switchOn()
    {
        if ( this.running == false)
        {
            this.running = true;
            this.firePropertyChangeEvent(new PropertyChangeEvent(this, "running", false, true));
            rpm = 10;
        } else {
            System.out.println("Motor is allready running");
        }
    }
    @Override
    public void switchOff()
    {
        if ( running == true)
        {
            running = false;
            this.firePropertyChangeEvent(new PropertyChangeEvent(this, "running", true, false));
            rpm = 0;
        } else {
            System.out.println("Motor is allready off");
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

    public void addPropertyChangeListener(final PropertyChangeListener listener){
        this.changeListeners.add(listener);
    }

    public void removePorpertyChangeListener(PropertyChangeListener listener){
        this.changeListeners.remove(listener);
    }

    private void firePropertyChangeEvent(PropertyChangeEvent pcEvent){
        for (final PropertyChangeListener listener : this.changeListeners){
            listener.propertyChange(pcEvent);
        }
    }
    
}
