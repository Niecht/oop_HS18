package oop08;


import oop02.Element;

import java.util.Objects;

/**
 * @author Sven Guggisberg 
 * @version 1.0
 * This class can return temperature in °C, °K and Farenheit. 
 */
public final class Temperatur implements Comparable<Temperatur>
{
    public static final float KELVIN_OFFSET = 273.15f;
    public static final float KELVIN_MAX = 2.538f * (float)Math.pow(10f, 32f);
    public static final float KELVIN_MIN = 0f;
    private final float kelvin;
    private String solid = "Solid";
    private String liquid = "Liquid";
    private String gas = "Gas";

    /**
     * Default Constructor for a temperature object.
     */
     private Temperatur()
    {
        kelvin = Temperatur.KELVIN_OFFSET;
    }
    
    /**
     * Constructor for a temperature object with defined temperature in &deg;C.
     */
    private Temperatur(float kelvin)
    {
        // Instanzvariable initialisieren
        this.kelvin = kelvin;
    }

    public static Temperatur createFromCelsius(float celsius){
        validTemperatureKelvin(celsius + KELVIN_OFFSET);
        return new Temperatur(celsius + KELVIN_OFFSET);
    }

    public static Temperatur createFromKelvin(final float kelvin){
        validTemperatureKelvin(kelvin);
        return new Temperatur(kelvin);
    }

    public static float kelvinToCelsius(float kelvin){
        return kelvin - Temperatur.KELVIN_OFFSET;
    }

    public static float celsiusToKelvin(float celsius){
        return celsius + Temperatur.KELVIN_OFFSET;
    }

    public static void validTemperatureKelvin(float kelvin){
        if (kelvin <= KELVIN_MAX && kelvin >= KELVIN_MIN){;
            //LOG.debug("Temperature: Valid");
        }else{
            throw new IllegalArgumentException("Not a valid temperature in Kelvin.");
        }
    }
    /**
     * Returns the temperature in °C.
     * @return Returns the temperature in °C as a float value.
     */
    public float getDegCelsius()
    {
        return Temperatur.kelvinToCelsius(this.kelvin);
    }

    /**
     * Allows you to set the temperature in °C.
     * @param  degCel The new temperature value.
     */
//    public void setDegCelsius(float degCel)
//    {
//        validTemperatureKelvin(degCel+KELVIN_OFFSET);
//        this.kelvin = Temperatur.celsiusToKelvin(degCel);
//    }

    public float getDegKelvin()
    {
        return this.kelvin;
    }

    public float getDegFahrenheit()
    {
        float degFahrenheit = Temperatur.kelvinToCelsius(this.getDegKelvin()) * 1.8f + 32;
        return degFahrenheit;
    }

//    public void changeTemperature(float change)
//    {
//        this.kelvin = this.getDegKelvin() + change;
//        validTemperatureKelvin(this.getDegKelvin());
//    }

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
    public final int hashCode()
    {
        return Objects.hash(this.getDegCelsius());
    }

    @Override
    public  int compareTo(Temperatur other){
        return Float.compare(this.getDegCelsius(), other.getDegCelsius());
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "kelvin=" + kelvin +
                '}';
    }
}
