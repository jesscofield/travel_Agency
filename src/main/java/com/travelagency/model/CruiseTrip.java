package com.travelagency.model;

public class CruiseTrip extends Trip {
    private boolean includesExcursions;

    public CruiseTrip(String destination, int durationDays, double price, String transport, String mealType, boolean includesExcursions) {
        super(destination, durationDays, price, transport, mealType);
        this.includesExcursions = includesExcursions;
    }

    public boolean isIncludesExcursions() { return includesExcursions; }
    public void setIncludesExcursions(boolean includesExcursions) { this.includesExcursions = includesExcursions; }

    @Override
    public String toString() {
        return super.toString() + String.format(", Includes Excursions: %b", includesExcursions);
    }
}