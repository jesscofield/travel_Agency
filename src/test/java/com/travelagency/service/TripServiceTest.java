package com.travelagency.service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.travelagency.model.RelaxationTrip;
import com.travelagency.model.ShoppingTrip;
import com.travelagency.model.Trip;

class TripServiceTest {

    @Test
    void testAddAndGetTrips() {
        TripService tripService = new TripService();
        Trip trip = new ShoppingTrip("Milan", 3, 500.0, "Plane", "Breakfast Only", true);

        tripService.addTrip(trip);
        List<Trip> trips = tripService.getTrips();

        assertEquals(1, trips.size()); // Перевіряємо, що список містить 1 елемент
        assertEquals("Milan", trips.get(0).getDestination()); // Перевіряємо, що пункт призначення — "Milan"
    }

    @Test
    void testFilterByDestination() {
        TripService tripService = new TripService();
        tripService.addTrip(new ShoppingTrip("Milan", 3, 500.0, "Plane", "Breakfast Only", true));
        tripService.addTrip(new RelaxationTrip("Maldives", 10, 3000.0, "Plane", "All Inclusive", true));

        List<Trip> filteredTrips = tripService.filterByDestination("Milan");
        assertEquals(1, filteredTrips.size());
        assertEquals("Milan", filteredTrips.get(0).getDestination());
    }

    @Test
    void testSortByPrice() {
        TripService tripService = new TripService();
        tripService.addTrip(new ShoppingTrip("Milan", 3, 500.0, "Plane", "Breakfast Only", true));
        tripService.addTrip(new RelaxationTrip("Maldives", 10, 3000.0, "Plane", "All Inclusive", true));

        tripService.sortByPrice(true); // Сортуємо за зростанням
        assertEquals(500.0, tripService.getTrips().get(0).getPrice());

        tripService.sortByPrice(false); // Сортуємо за спаданням
        assertEquals(3000.0, tripService.getTrips().get(0).getPrice());
    }
}