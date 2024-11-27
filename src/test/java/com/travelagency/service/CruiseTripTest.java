package com.travelagency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.travelagency.model.CruiseTrip;

class CruiseTripTest {

    @Test
    void testConstructorAndGetters() {
        String destination = "Caribbean";
        int durationDays = 7;
        double price = 1500.0;
        String transport = "Ship";
        String mealType = "All-inclusive";
        boolean includesExcursions = true;

        CruiseTrip cruiseTrip = new CruiseTrip(destination, durationDays, price, transport, mealType, includesExcursions);

        assertEquals(destination, cruiseTrip.getDestination());
        assertEquals(durationDays, cruiseTrip.getDurationDays());
        assertEquals(price, cruiseTrip.getPrice());
        assertEquals(transport, cruiseTrip.getTransport());
        assertEquals(mealType, cruiseTrip.getMealType());
        assertTrue(cruiseTrip.isIncludesExcursions());
    }

    @Test
    void testSetIncludesExcursions() {
        CruiseTrip cruiseTrip = new CruiseTrip("Caribbean", 7, 1500.0, "Ship", "All-inclusive", false);

        cruiseTrip.setIncludesExcursions(true);

        assertTrue(cruiseTrip.isIncludesExcursions());
    }

    @Test
    void testToString() {
        CruiseTrip cruiseTrip = new CruiseTrip("Caribbean", 7, 1500.0, "Ship", "All-inclusive", true);

        String result = cruiseTrip.toString();

        assertTrue(result.contains("Caribbean"));
        assertTrue(result.contains("7 days"));
        assertTrue(result.contains("1500.0"));
        assertTrue(result.contains("Ship"));
        assertTrue(result.contains("All-inclusive"));
        assertTrue(result.contains("Includes Excursions: true"));
    }
}