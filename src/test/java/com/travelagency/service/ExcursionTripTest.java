package com.travelagency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.travelagency.model.ExcursionTrip;

class ExcursionTripTest {

    @Test
    void testConstructorAndGetters() {
        String destination = "Rome";
        int durationDays = 5;
        double price = 1200.0;
        String transport = "Plane";
        String mealType = "Breakfast-only";
        boolean includesGuide = true;

        ExcursionTrip excursionTrip = new ExcursionTrip(destination, durationDays, price, transport, mealType, includesGuide);

        assertEquals(destination, excursionTrip.getDestination());
        assertEquals(durationDays, excursionTrip.getDurationDays());
        assertEquals(price, excursionTrip.getPrice());
        assertEquals(transport, excursionTrip.getTransport());
        assertEquals(mealType, excursionTrip.getMealType());
        assertTrue(excursionTrip.isIncludesGuide());
    }

    @Test
    void testSetIncludesGuide() {
        ExcursionTrip excursionTrip = new ExcursionTrip("Rome", 5, 1200.0, "Plane", "Breakfast-only", false);

        excursionTrip.setIncludesGuide(true);

        assertTrue(excursionTrip.isIncludesGuide());
    }

    @Test
    void testToString() {
        ExcursionTrip excursionTrip = new ExcursionTrip("Rome", 5, 1200.0, "Plane", "Breakfast-only", true);

        String result = excursionTrip.toString();

        assertTrue(result.contains("Rome"));
        assertTrue(result.contains("5 days"));
        assertTrue(result.contains("1200.0"));
        assertTrue(result.contains("Plane"));
        assertTrue(result.contains("Breakfast-only"));
        assertTrue(result.contains("Includes Guide: true"));
    }
}