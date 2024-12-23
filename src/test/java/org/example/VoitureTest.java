package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoitureTest {

    private Voiture voiture1;
    private Voiture voiture2;
    private Voiture voiture3;

    @BeforeEach
    void setUp() {
        voiture1 = new Voiture(1, "Toyota", "Corolla");
        voiture2 = new Voiture(2, "Honda", "Civic");
        voiture3 = new Voiture(3, "Ford", "Corolla");
    }

    @AfterEach
    void tearDown() {
        voiture1 = null;
        voiture2 = null;
        voiture3 = null;
    }

    @Test
    void hasSameModel() {
        assertTrue(voiture1.hasSameModel(voiture3), "Les modèles doivent être identiques");
        assertFalse(voiture1.hasSameModel(voiture2), "Les modèles doivent être différents");
    }

    @Test
    void isIdentical() {
        Voiture identicalCar = new Voiture(1, "Toyota", "Corolla");
        assertTrue(voiture1.isIdentical(identicalCar), "Les voitures doivent être identiques");
        assertFalse(voiture1.isIdentical(voiture2), "Les voitures doivent être différentes");
    }
}
