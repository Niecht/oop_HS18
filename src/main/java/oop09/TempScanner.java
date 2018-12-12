package oop09;

import oop08.Temperatur;
import oop08.TemperaturVerlauf;
import oop08.TemperatureChangeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public final class TempScanner {

    private static final Logger LOG = LogManager.getLogger(TempScanner.class);
    private static TemperaturVerlauf verlauf;

    public TempScanner() {
        verlauf = new TemperaturVerlauf();
        this.verlauf.addPropertyChangeListener(new TemperatureChangeListener());
    }

    private class TemperatureChangeListener implements oop08.TemperatureChangeListener{
        public void temperatureChange(TemperatureChangeEvent evt) {
            LOG.debug("Property change recorded.");
            if (evt.getExtrema() > 0){
                System.out.println("The temperature " + evt.getNewTemp() + "°C replaces " + evt.getOldTemp() + "°C as the highest value");
            } else if (evt.getExtrema() < 0){
                System.out.println("The temperature " + evt.getNewTemp() + "°C replaces " + evt.getOldTemp() + "°C as the lowest value");

            }

        }
    }

    public static void main(String[] args) {
        new TempScanner().run();
    }


    private void run(){

        String input = "";
        Scanner scanner = new Scanner(System.in);

        try {

            do {

                System.out.println("Please enter temperature in Celsius ('exit' to terminate): ");
                input = scanner.next();

                switch (input){
                    case "max":
                        System.out.println("The maximal recorded temperature is " + verlauf.max());
                        break;
                    case "min":
                        System.out.println("The minimal recorded temperature is " + verlauf.min());
                        break;
                    case "average":
                        System.out.println("The average temperature over " + verlauf.getCount() + " measurements is " + verlauf.average());
                        break;
                    case "exit":
                        System.out.println(verlauf.toString());
                        break;
                        default:
                            verlauf.add(Temperatur.createFromCelsius(Float.valueOf(input)));
                            break;
                }
                if (input.equals("exit")){
                    LOG.error("Program terminated.");
                    break;
                }
            } while ( !input.equals("exit"));

        }   catch (NumberFormatException nfe){
            LOG.error(" Your input \"" + input + "\" is not valid. Valid inputs are: \"Temperature values\", max, min, average and exit");
        }   catch (IllegalArgumentException iae){
            LOG.error(" Your input \"" + input + "\" is not valid. Please enter a valid temperature in Celsius");
        }
    }
}
