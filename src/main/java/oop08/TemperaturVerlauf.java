package oop08;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class TemperaturVerlauf{

    public Collection<Temperatur> verlauf;
    private final List<TemperatureChangeListener> changeListeners = new ArrayList<>();

    public TemperaturVerlauf(){
        verlauf = new ArrayList();
    }

    public void add(Temperatur temperatur){
        if ( this.getCount() > 0) {
            if ( temperatur.getDegCelsius() > this.max()) {
                final TemperatureChangeEvent tcEvent = new TemperatureChangeEvent(this, 1, this.max(), temperatur.getDegCelsius());
                this.fireTemperatureChangeEvent(tcEvent);
            } else if ( temperatur.getDegCelsius() < this.min()) {
                final TemperatureChangeEvent tcEvent = new TemperatureChangeEvent(this, -1, this.min(), temperatur.getDegCelsius());
                this.fireTemperatureChangeEvent(tcEvent);
            }
        }
        verlauf.add(temperatur);
    }

    public Temperatur get(int index) {
        return ((List<Temperatur>)verlauf).get(index);
    }

//    public int getIndexOf(float temp){
//        return (ArrayList<Temperatur>) verlauf.indexOf(temp);
//    }

    public int getCount(){
       return verlauf.size();
    }

    public void clear(){
        verlauf.clear();
    }

    public float max(){
        return Collections.max(verlauf).getDegCelsius();

    }

    public float min(){
        return Collections.min(verlauf).getDegCelsius();
    }

    public float average(){
        float average = 0;
        if(verlauf.size() > 0) {
            for (Temperatur temp : verlauf) {
                average += temp.getDegCelsius();
            }
            return average / verlauf.size();
        }
        return Float.NaN; //NaN can not be used for calculations.
    }

    @Override
    public String toString(){
        return this.getCount() + " Values entered, average temperature: " + this.average() + ", minimal temperature: " + this.min() + ", maximal temperature: " + this.max();
    }

    public void addPropertyChangeListener( final TemperatureChangeListener listener){
        this.changeListeners.add(listener);
    }

    public void removePropertyChangeListener( final TemperatureChangeListener listener){
        this.changeListeners.remove(listener);
    }

    private void fireTemperatureChangeEvent(final TemperatureChangeEvent tcEvent){
        for (final TemperatureChangeListener listener : this.changeListeners){
            listener.temperatureChange(tcEvent);
        }
    }
}
