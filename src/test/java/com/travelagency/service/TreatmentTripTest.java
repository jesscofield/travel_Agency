package com.travelagency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.travelagency.model.TreatmentTrip;

class TreatmentTripTest {

    @Test
    void testConstructorAndGetters() {
        String destination = "Germany";
        int durationDays = 14;
        double price = 8000.0;
        String transport = "Plane";
        String mealType = "Full-board";
        boolean includesMedicalConsultation = true;

        TreatmentTrip treatmentTrip = new TreatmentTrip(destination, durationDays, price, transport, mealType, includesMedicalConsultation);

        assertEquals(destination, treatmentTrip.getDestination());
        assertEquals(durationDays, treatmentTrip.getDurationDays());
        assertEquals(price, treatmentTrip.getPrice());
        assertEquals(transport, treatmentTrip.getTransport());
        assertEquals(mealType, treatmentTrip.getMealType());
        assertTrue(treatmentTrip.isIncludesMedicalConsultation(), "IncludesMedicalConsultation should be true");
    }

    @Test
    void testSetIncludesMedicalConsultation() {
        TreatmentTrip treatmentTrip = new TreatmentTrip("Germany", 14, 8000.0, "Plane", "Full-board", false);

        treatmentTrip.setIncludesMedicalConsultation(true);

        assertTrue(treatmentTrip.isIncludesMedicalConsultation(), "IncludesMedicalConsultation should be true after setting it");
    }

    @Test
    void testToString() {
        TreatmentTrip treatmentTrip = new TreatmentTrip("Germany", 14, 8000.0, "Plane", "Full-board", true);

        String result = treatmentTrip.toString();

        assertTrue(result.contains("Germany"));
        assertTrue(result.contains("14 days"));
        assertTrue(result.contains("8000.0"));
        assertTrue(result.contains("Plane"));
        assertTrue(result.contains("Full-board"));
        assertTrue(result.contains("Includes Medical Consultation: true"), "toString should include 'Includes Medical Consultation: true'");
    }
}