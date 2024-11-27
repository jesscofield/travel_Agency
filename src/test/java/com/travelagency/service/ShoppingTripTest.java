package com.travelagency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.travelagency.model.ShoppingTrip;

class ShoppingTripTest {

    @Test
    void testConstructorAndGetters() {
        String destination = "Dubai";
        int durationDays = 7;
        double price = 3000.0;
        String transport = "Plane";
        String mealType = "Breakfast-only";
        boolean includesDiscounts = true;

        ShoppingTrip shoppingTrip = new ShoppingTrip(destination, durationDays, price, transport, mealType, includesDiscounts);

        assertEquals(destination, shoppingTrip.getDestination());
        assertEquals(durationDays, shoppingTrip.getDurationDays());
        assertEquals(price, shoppingTrip.getPrice());
        assertEquals(transport, shoppingTrip.getTransport());
        assertEquals(mealType, shoppingTrip.getMealType());
        assertTrue(shoppingTrip.isIncludesDiscounts(), "IncludesDiscounts should be true");
    }

    @Test
    void testSetIncludesDiscounts() {
        ShoppingTrip shoppingTrip = new ShoppingTrip("Dubai", 7, 3000.0, "Plane", "Breakfast-only", false);

        shoppingTrip.setIncludesDiscounts(true);

        assertTrue(shoppingTrip.isIncludesDiscounts(), "IncludesDiscounts should be true after setting it");
    }

    @Test
    void testToString() {
        ShoppingTrip shoppingTrip = new ShoppingTrip("Dubai", 7, 3000.0, "Plane", "Breakfast-only", true);

        String result = shoppingTrip.toString();

        assertTrue(result.contains("Dubai"));
        assertTrue(result.contains("7 days"));
        assertTrue(result.contains("3000.0"));
        assertTrue(result.contains("Plane"));
        assertTrue(result.contains("Breakfast-only"));
        assertTrue(result.contains("Includes Discounts: true"), "toString should include 'Includes Discounts: true'");
    }
}