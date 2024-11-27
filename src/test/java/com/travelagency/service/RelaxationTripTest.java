package com.travelagency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.travelagency.model.RelaxationTrip;

class RelaxationTripTest {

    @Test
    void testConstructorAndGetters() {
        String destination = "Maldives";
        int durationDays = 10;
        double price = 5000.0;
        String transport = "Plane";
        String mealType = "Full-board";
        boolean includesSpa = true;

        RelaxationTrip relaxationTrip = new RelaxationTrip(destination, durationDays, price, transport, mealType, includesSpa);

        assertEquals(destination, relaxationTrip.getDestination());
        assertEquals(durationDays, relaxationTrip.getDurationDays());
        assertEquals(price, relaxationTrip.getPrice());
        assertEquals(transport, relaxationTrip.getTransport());
        assertEquals(mealType, relaxationTrip.getMealType());
        assertTrue(relaxationTrip.isIncludesSpa(), "IncludesSpa should be true");
    }

    @Test
    void testSetIncludesSpa() {
        RelaxationTrip relaxationTrip = new RelaxationTrip("Maldives", 10, 5000.0, "Plane", "Full-board", false);

        relaxationTrip.setIncludesSpa(true);

        assertTrue(relaxationTrip.isIncludesSpa(), "IncludesSpa should be true after setting it");
    }

    @Test
    void testToString() {
        RelaxationTrip relaxationTrip = new RelaxationTrip("Maldives", 10, 5000.0, "Plane", "Full-board", true);

        String result = relaxationTrip.toString();

        assertTrue(result.contains("Maldives"));
        assertTrue(result.contains("10 days"));
        assertTrue(result.contains("5000.0"));
        assertTrue(result.contains("Plane"));
        assertTrue(result.contains("Full-board"));
        assertTrue(result.contains("Includes Spa: true"), "toString should include 'Includes Spa: true'");
    }
}