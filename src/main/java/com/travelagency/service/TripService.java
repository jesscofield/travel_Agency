package com.travelagency.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.travelagency.model.CruiseTrip;
import com.travelagency.model.ExcursionTrip;
import com.travelagency.model.Trip;

public class TripService {
    private final List<Trip> trips;

    public TripService() {
        this.trips = new ArrayList<>();
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void initializeSampleTrips() {
        trips.add(new CruiseTrip("Caribbean", 14, 3000.0, "Ship", "All-inclusive", true));
        trips.add(new ExcursionTrip("Rome", 5, 1200.0, "Plane", "Breakfast-only", true));
        trips.add(new CruiseTrip("Mediterranean", 10, 2500.0, "Ship", "Full-board", false));
        trips.add(new ExcursionTrip("Paris", 3, 800.0, "Train", "Half-board", false));
    }    
    

    public List<Trip> filterByDestination(String destination) {
        List<Trip> result = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getDestination().equalsIgnoreCase(destination)) {
                result.add(trip);
            }
        }
        return result;
    }

    public void sortByPrice(boolean ascending) {
        trips.sort(ascending ? Comparator.comparingDouble(Trip::getPrice)
                : Comparator.comparingDouble(Trip::getPrice).reversed());
    }

    public void sortByDuration(boolean ascending) {
        trips.sort(ascending ? Comparator.comparingInt(Trip::getDurationDays)
                : Comparator.comparingInt(Trip::getDurationDays).reversed());
    }
}