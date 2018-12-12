package oop07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void constructor(){
        Person person = new Person(4, "Detlef", "Siajfd", 25);
        assertEquals(4, person.getId());
        assertEquals("Detlef", person.getNachname());
        assertEquals("Siajfd", person.getVorname());
        assertEquals(25, person.getAge());
    }

    @Test
    void equalsContract(){
        EqualsVerifier.forClass(Person.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }

    @Test
    void equalsTrue(){
        Person personTest = new Person(34,"Muster", "Ueli", 78);
        assertTrue(personTest.equals(personTest));
    }

    @Test
    void equalsFalse(){
        assertFalse(new Person(90, "Bucher", "Franziska", 101).equals(new Person(11, "Meier", "Susi",12)));
    }

    // mehr tests z.B. mit null oder mit Objekt einer anderen Klasse

    @Test
    void hashCodeequals() {
        assertEquals(new Person(123, "Peter", "Peter",43).hashCode(), new Person(123, "Peter", "Peter",43).hashCode());
    }

    @Test
    void hashCodeUnequals() {
        assertNotEquals(new Person(645, "Erpel", "Donald",9).hashCode(), new Person(938, "Wofgang", "Reifen",28));
    }

    @Test
    void comparableSmaller(){
        assertTrue((new Person( 999, "Agner", "Adolf",33).compareTo(new Person(764, "Detlef", "D",85))) < 0);
    }

    @Test
    void comparableBigger(){
        assertTrue((new Person(666, "Taum", "Julia",12).compareTo(new Person(8652, "Baum", "Ast", 54))) > 0);
    }

    @Test
    void comparableEquals(){
        assertEquals(0, new Person(2543, "Keasr", "Fridolin", 31).compareTo(new Person(2543, "Keasr", "Fridolin",31)));
    }
//    @Test
//    void toString() {
//    }
//
//    @Test
//    void getName() {
//    }
//
//    @Test
//    void setName() {
//    }
//
//    @Test
//    void getId() {
//    }
}