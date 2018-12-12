package oop08;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import oop07.Person;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    /**
     * Tests the kelvinToCelsius Method
     */
    @Test
    void kelvinToCelsiusZeroK(){
        assertEquals(0f, Temperatur.kelvinToCelsius(273.15f));
    }

    @Test
    void kelvinToCelsiusZeroC(){
        assertEquals(-273.15f, Temperatur.kelvinToCelsius(0f));
    }

    @Test
    void kelvinToCelsiusPositive(){
        assertEquals(20f, Temperatur.kelvinToCelsius(293.15f));
    }

    @Test
    void kelvinToCelsiusNegative(){
        assertEquals(-20f,Temperatur.kelvinToCelsius(253.15f));
    }

    /**
     * Imagine the same would be done for celsiusToKelvin...
     */


    /**
     * Tests the get Method for zero, positive and negative numbers.
     */
    @Test
    void getDegCelsiusDefault() {
        assertEquals(0f, Temperatur.createFromKelvin(273.15f).getDegCelsius());
    }

    @Test
    void getDegCelsiusPositive(){
        assertEquals(20.5f, Temperatur.createFromCelsius(20.5f).getDegCelsius());
    }

    @Test
    void getDegCelsiusNegative(){
        assertEquals(-30f, Temperatur.createFromCelsius(-30f).getDegCelsius());
    }

    /**
     * Tests the set Method for zero, positive and negative numbers.
     */
//    @Test
//    void setDegCelsiusZero() {
//        Temperatur temp = new Temperatur().createFromKelvin(46f);
//        temp.setDegCelsius(0);
//        assertEquals(0f, temp.getDegCelsius());
//    }
//
//    @Test
//    void setDegCelsiusPositive() {
//        Temperatur temp = new Temperatur();
//        temp.setDegCelsius(120f);
//        assertEquals(120f, temp.getDegCelsius());
//    }
//
//    @Test
//    void setDegCelsiusNegative(){
//        Temperatur temp = new Temperatur();
//        temp.setDegCelsius(-244.345f);
//        assertEquals(-244.345f, temp.getDegCelsius());
//    }

    /**
     * Tests the Method that returns the temperature in Kelvin.
     */
    @Test
    void getDegKelvinZeroC() {
        assertEquals(273.15f, Temperatur.createFromCelsius(273.15f).getDegKelvin());
    }

    @Test
    void getDegKelvinZeroK(){
        assertEquals(0f, Temperatur.createFromCelsius(-273.15f).getDegKelvin());
    }

    @Disabled ("exception has to be caught") @Test
    void getDegKelvinNegK(){
        assertEquals(-20f, Temperatur.createFromKelvin(-293.15f).getDegKelvin());
    }

    @Test
    void getDegKelvinPos(){
        assertEquals(351.15f, Temperatur.createFromCelsius(78f).getDegKelvin());
    }

    /**
     * Tests the Method that returns the temperature in Fahrenheit.
     */
    @Test
    void getDegFahrenheitZeroC() {
        assertEquals(32f, Temperatur.createFromCelsius(0f).getDegFahrenheit());
    }

    @Disabled("Float has rounding issues") @Test
    void getDegFahrenheitZeroF(){
        assertEquals(0.14f, Temperatur.createFromKelvin(-17f).getDegFahrenheit());
    }

    @Test
    void getDegFahrenheitPosF(){
        assertEquals(167f, Temperatur.createFromCelsius(75f).getDegFahrenheit());
    }

    /**
     * Tests the Method that allows the temperature to be changed by a value.
     */
//    @Test
//    void changeTemperaturePositive() {
//        Temperatur temperatur = new Temperatur();
//        temperatur.changeTemperature(59f);
//        assertEquals(59f, temperatur.getDegCelsius());
//    }
//
//    @Test
//    void changeTemperatureNegative(){
//        Temperatur temperatur = new Temperatur().createFromCelsius(49f);
//        temperatur.changeTemperature(-63f);
//        assertEquals(-14f, temperatur.getDegCelsius());
//    }

    /**
     *  Tests the equals Method.
     */

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Temperatur.class)
                .withOnlyTheseFields("kelvin")
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }

    @Test
    void equalSelf(){
        Temperatur temperatur = Temperatur.createFromKelvin(234.3f );
        assertTrue(temperatur.equals(temperatur));
    }

    @Test
    void equalsClassFalse(){
        Temperatur temperatur = Temperatur.createFromCelsius(-24.3f );
        assertTrue(!temperatur.equals(new Person(324, "A", "B", 13)));
    }

    @Test
    void equalsFalse(){
        Temperatur temperatur = Temperatur.createFromKelvin( 6354.4f );
        assertTrue(!temperatur.equals(Temperatur.createFromCelsius( -32.3f )));
    }

    @Test
    void equalsTrue(){
        Temperatur temperatur = Temperatur.createFromKelvin( 34.2f);
        assertTrue(temperatur.equals(Temperatur.createFromKelvin(34.2f)));
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    void hashCodeEquals(){
        assertEquals(Temperatur.createFromKelvin(20.0f).hashCode(),Temperatur.createFromKelvin(20.0f).hashCode());
    }

    @Test
    void hashCodeUnequals(){
        assertNotEquals(Temperatur.createFromKelvin(0f).hashCode(), Temperatur.createFromCelsius(-24.4f).hashCode());
    }

    /**
     *  Tests the implementation of the Comparable Interface.
     */
    @Test
    void comparableSmaller(){
        assertTrue((Temperatur.createFromKelvin(0f).compareTo(Temperatur.createFromKelvin(6342f))) < 0);
    }

    @Test
    void comparableBigger(){
        assertTrue((Temperatur.createFromKelvin(3.2f).compareTo(Temperatur.createFromKelvin(0f))) > 0);
    }

    @Test
    void comparableEquals(){
        assertEquals(0,(Temperatur.createFromKelvin(50.2f).compareTo(Temperatur.createFromKelvin(50.2f))));
    }

    /**
     * Tests the Exception handling.
     */
    @Test
    public void testIllegalArgumentExceptionValid(){
        assertThatThrownBy(() -> {
            Temperatur.validTemperatureKelvin(-4f);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Not a valid temperature in Kelvin.");
    }

    @Test
    public void testIllegalArgumentExceptionKelvin(){
        assertThatThrownBy(() -> {
            Temperatur.createFromKelvin(-4f);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Not a valid temperature in Kelvin.");
    }

    @Test
    public void testIllegalArgumentExceptionCelsius(){
        assertThatThrownBy(() -> {
            Temperatur.createFromCelsius(-400f);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Not a valid temperature in Kelvin.");
    }
}
