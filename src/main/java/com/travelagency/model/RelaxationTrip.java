package com.travelagency.model;

public class RelaxationTrip extends Trip {
    private boolean includesSpa;

    public RelaxationTrip(String destination, int durationDays, double price, String transport, String mealType, boolean includesSpa) {
        super(destination, durationDays, price, transport, mealType);
        this.includesSpa = includesSpa;
    }

    public boolean isIncludesSpa() { return includesSpa; }
    public void setIncludesSpa(boolean includesSpa) { this.includesSpa = includesSpa; }

    @Override
    public String toString() {
        return super.toString() + String.format(", Includes Spa: %b", includesSpa);
    }
}