package oop06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void additionMinusPlus() {
        assertEquals(5, new Calculator().addition(-2,7));
    }

    @Test
    void additionPlusMinus() {
        assertEquals(9, new Calculator().addition(10,-1));
    }

    @Test
    void additionZero() {
        assertEquals(0, new Calculator().addition(0,0));
    }

    @Test
    void additionPositive() {
        assertEquals(81, new Calculator().addition(73,8));
    }

    @Test
    void additionNegative() {
        assertEquals(-50, new Calculator().addition(-24,-26));
    }

    @Test
    void additionMax() {
        assertEquals(2147483647, new Calculator().addition(2147482810,837));
    }

    @Test
    void additionMin() {
        assertEquals(-2147483648, new Calculator().addition(-147482811,-2000000837));
    }

    @Test
    void additionOverflow() {
        assertEquals(-2147483648, new Calculator().addition(2147482810,838));
    }

    @Test
    void additionUnderflow() {
        assertEquals(2147483647, new Calculator().addition(-147482811,-2000000838));
    }


}