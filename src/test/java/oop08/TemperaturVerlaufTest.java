//package oop08;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class TemperaturVerlaufTest {
//
//    @Test
//    void add() {
//        TemperaturVerlauf verlauf = new TemperaturVerlauf();
//        verlauf.add(new Temperatur.(20f));
//        assertEquals(20f, verlauf.get(0).getDegCelsius());
//    }
//
//    @Test
//    void getCount() {
//       TemperaturVerlauf verlauf = new TemperaturVerlauf();
//       verlauf.add(new Temperatur(20f));
//       verlauf.add(new Temperatur(-40f));
//       verlauf.add(new Temperatur(23.4f));
//       assertEquals(3, verlauf.getCount());
//    }
//
//    @Test
//    void clear() {
//        TemperaturVerlauf verlauf = new TemperaturVerlauf();
//        verlauf.add(new Temperatur(20f));
//        verlauf.add(new Temperatur(-40f));
//        verlauf.add(new Temperatur(23.4f));
//        verlauf.clear();
//        assertEquals(0, verlauf.getCount());
//    }
//
//    @Test
//    void average() {
//        TemperaturVerlauf verlauf = new TemperaturVerlauf();
//        verlauf.add(new Temperatur(20f));
//        verlauf.add(new Temperatur(-40f));
//        verlauf.add(new Temperatur(45f));
//        verlauf.add(new Temperatur(60f));
//        assertEquals(21.25f, verlauf.average());
//    }
//
//    @Test
//    void min() {
//        TemperaturVerlauf verlauf = new TemperaturVerlauf();
//        verlauf.add(new Temperatur(20f));
//        verlauf.add(new Temperatur(-40f));
//        verlauf.add(new Temperatur(23.4f));
//        verlauf.clear();
//        assertEquals(-40f, verlauf.min());
//    }
//
//
//}