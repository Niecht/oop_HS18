package oop11;

import oop08.Temperatur;
import oop08.TemperaturVerlauf;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class DataPoint {
    private TemperaturVerlauf tempv;
    private Collection<LocalDateTime> time;

    public DataPoint(){
        this.tempv = new TemperaturVerlauf();
        this.time = new ArrayList();
    }

    public void addDataPoint( Temperatur temp, LocalDateTime date){
        this.tempv.add(temp);
        this.time.add(date);
    }

    public void getMax(){
        (ArrayList)tempv.verlauf.indexOf(tempv.max());
    }
}
