package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person1;
    private Person person2;

    @BeforeEach
    void setUp() {
        person1 = new Person("Alice", "Smith", LocalDate.of(1990, 5, 12));
        person2 = new Person("Bob", "Smith", LocalDate.of(1985, 3, 9));
    }

    @AfterEach
    void tearDown() {
        person1 = null;
        person2 = null;
    }

    @Test
    void fullName() {
        assertEquals("Alice Smith", person1.FullName("Alice","Smith" ), "Le nom complet n'est pas correct.");
        assertEquals("Bob Smith", person2.FullName("Bob","Smith"), "Le nom complet n'est pas correct.");
    }

    @Test
    void age() {
        int currentYear = LocalDate.now().getYear();
        assertEquals(currentYear - 1990, person1.Age(1990), "L'âge de la première personne n'est pas correct.");
        assertEquals(currentYear - 1985, person2.Age(1985), "L'âge de la deuxième personne n'est pas correct.");
    }

    @Test
    void hasSameLastName() {
        assertTrue(person1.hasSameLastName(person2), "Les personnes devraient avoir le même nom de famille.");
        Person person3 = new Person("Charlie", "Brown", LocalDate.of(2000, 1, 15));
        assertFalse(person1.hasSameLastName(person3), "Les personnes ne devraient pas avoir le même nom de famille.");
    }
}
