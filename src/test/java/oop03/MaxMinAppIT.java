/*
 * Copyright 2018 Roland Gisler, HSLU Informatik, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package oop03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ch.hslu.demo.DemoApp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Beispiel für Integrationstests.
 * Namenskonvention 'IT' am Schluss. Werden mit dem Goal
 * integration-test ausgeführt.
 */
public class MaxMinAppIT {

    /**
     * MaxMin-Test für Parameterübergabe an Testfall.
     * Sinnvoll für Interaktion mit Dateisystem.
     */

    @Test
    void maxFirst() {
        final MaxMin max = new MaxMin();
        int test = max.max(5,2);
        assertEquals( 5, test);
    }

    @Test
    void maxLast(){
        assertEquals(9, new MaxMin().max(1,9));
    }

    @Test
    void maxEqual(){
        assertEquals(5, new MaxMin().max(5,5));
    }

    @Test
    void min() {
        System.out.println("min test");
    }

    @Test
    void max1() {
        System.out.println("max1 test");
    }

    @Test
    void maxIf() {
        System.out.println("maxIf test");
    }

    @Test
    void maxElse() {
        System.out.println("maxElse");
    }
}
