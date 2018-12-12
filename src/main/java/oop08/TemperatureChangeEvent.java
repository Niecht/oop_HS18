package oop08;

import java.util.EventObject;

public class TemperatureChangeEvent extends EventObject {

    private int extrema;
    private float oldTemp;
    private float newTemp;
    /**
     * Constructs a new {@code TemperatureChangeEvent}.
     *
     * @param source        the bean that fired the event
     * @param extrema       if the cause of the event is a new max or min
     *
     * @throws IllegalArgumentException if {@code source} is {@code null}
     */
    public TemperatureChangeEvent(Object source, int extrema, float oldTemp, float newTemp) {
        super(source);
        this.extrema = extrema;
        this.oldTemp = oldTemp;
        this.newTemp = newTemp;
    }

    public int getExtrema(){
        return this.extrema;
    }

    public float getOldTemp(){
        return this.oldTemp;
    }

    public float getNewTemp(){
        return this.newTemp;
    }
}
