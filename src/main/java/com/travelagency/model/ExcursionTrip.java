package com.travelagency.model;

public class ExcursionTrip extends com.travelagency.model.Trip {
    private boolean includesGuide;

    public ExcursionTrip(String destination, int durationDays, double price, String transport, String mealType, boolean includesGuide) {
        super(destination, durationDays, price, transport, mealType);
        this.includesGuide = includesGuide;
    }

    public boolean isIncludesGuide() { return includesGuide; }
    public void setIncludesGuide(boolean includesGuide) { this.includesGuide = includesGuide; }

    @Override
    public String toString() {
        return super.toString() + String.format(", Includes Guide: %b", includesGuide);
    }
}