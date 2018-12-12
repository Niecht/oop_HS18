package oop02;

import oop08.EnumTemp;

import java.util.Objects;

/**
 * @author Sven Guggisberg 
 * @version 1.0
 * This class can return temperature in °C, °K and Farenheit. 
 */
public class Temperatur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private float degCelsius;
    private String solid = "Solid";
    private String liquid = "Liquid";
    private String gas = "Gas";

    /**
     * Default Constructor for a temperature object.
     */
    public Temperatur()
    {
        degCelsius = 0;
    }
    
    /**
     * Constructor for a temperature objetct with defined temperature in °C.
     */
    public Temperatur(float degCel)
    {
        // Instanzvariable initialisieren
        degCelsius = degCel;
    }

    /**
     * Returns the temperature in °C.
     * @return Returns the temperature in °C as a float value.
     */
    public float getDegCelsius()
    {
        // tragen Sie hier den Code ein
        return degCelsius;
    }

    /**
     * Allows you to set the temperature in °C.
     * @param  degCel The new temperature value.
     */
    public void setDegCelsius(float degCel)
    {
        this.degCelsius = degCel;
    }

    public float getDegKelvin()
    {
        float degKelvin = this.degCelsius + 273.15f;
        return degKelvin;
    }

    public float getDegFahrenheit()
    {
        float degFahrenheit = this.degCelsius * 1.8f + 32;
        return degFahrenheit;
    }

    public void changeTemperature(float change)
    {
        this.degCelsius = this.degCelsius + change;
    }

    public String getState( String element )
    {
        switch ( element )
        {
            case "N":
            if ( this.degCelsius >= -196f )
            {
                return this.gas;
            } else if ( this.degCelsius >= -210.1f ){
                return this.liquid;
            } else {
                return this.solid;
            }
            case "Pb":
            if ( this.degCelsius >= 1744f )
            {
                return this.gas;
            } else if ( this.degCelsius >= 327.43f ){
                return this.liquid;
            } else {
                return this.solid;
            }
            case "Hg":
            if ( this.degCelsius >= 346.73f )
            {
                return this.gas;
            } else if ( this.degCelsius >= -38.83f ){
                return this.liquid;
            } else {
                return this.solid;
            }
            default :
            return "Element existiert nicht";
        }
    }

    public EnumTemp getPhase( Element element )
    {
        if ( this.degCelsius >= element.getTempB() ) 
        {
            return EnumTemp.GAS;
        } else if ( this.degCelsius >= element.getTempM() )
        {
            return EnumTemp.LIQUID;
        } else {
            return EnumTemp.SOLID;
        }

    }
    private String textOut(Element element){
            return element.getName() + " ist bei " + this.getDegCelsius() + "°C " + this.getPhase(element);
    }

    @Override
    public final boolean equals (final Object temperature)
    {
        if (temperature == this)
        {
            return true;
        }
        if (!(temperature instanceof Temperatur))
        {
            return false;
        }
        final Temperatur other = (Temperatur) temperature;
        return ((Objects.equals(this.getDegCelsius(), other.getDegCelsius())));
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.getDegCelsius());
    }
}
