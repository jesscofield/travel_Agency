package com.travelagency.model;

public class ShoppingTrip extends Trip {
    private boolean includesDiscounts;

    public ShoppingTrip(String destination, int durationDays, double price, String transport, String mealType, boolean includesDiscounts) {
        super(destination, durationDays, price, transport, mealType);
        this.includesDiscounts = includesDiscounts;
    }

    public boolean isIncludesDiscounts() { return includesDiscounts; }
    public void setIncludesDiscounts(boolean includesDiscounts) { this.includesDiscounts = includesDiscounts; }

    @Override
    public String toString() {
        return super.toString() + String.format(", Includes Discounts: %b", includesDiscounts);
    }
}