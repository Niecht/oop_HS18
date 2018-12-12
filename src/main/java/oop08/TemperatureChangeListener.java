package oop08;

/**
 * A "TemperatureChange" event gets fired whenever a Temperature changes a "bound"
 * property.  You can register a TemperatureChangeListener with a source
 * bean so as to be notified of any bound property updates.
 */

public interface TemperatureChangeListener extends java.util.EventListener{
    /**
     * This method gets called when a bound property is changed.
     * @param evt A TemperatureChange object describing the event source
     *          and the property that has changed.
     */
    void temperatureChange(TemperatureChangeEvent evt);
}
