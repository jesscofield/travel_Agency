package com.travelagency.utils;

import java.util.Comparator;

import com.travelagency.model.Trip;

public class TripComparator {

    public static Comparator<Trip> byPrice() {
        return Comparator.comparingDouble(Trip::getPrice);
    }

    public static Comparator<Trip> byDuration() {
        return Comparator.comparingInt(Trip::getDurationDays);
    }

    public static Comparator<Trip> byDestination() {
        return Comparator.comparing(Trip::getDestination, String.CASE_INSENSITIVE_ORDER);
    }
}