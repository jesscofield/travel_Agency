package com.travelagency.model;

public abstract class Trip {
    private String destination;
    private int durationDays;
    private double price;
    private String transport;
    private String mealType;

    public Trip(String destination, int durationDays, double price, String transport, String mealType) {
        this.destination = destination;
        this.durationDays = durationDays;
        this.price = price;
        this.transport = transport;
        this.mealType = mealType;
    }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public int getDurationDays() { return durationDays; }
    public void setDurationDays(int durationDays) { this.durationDays = durationDays; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getTransport() { return transport; }
    public void setTransport(String transport) { this.transport = transport; }

    public String getMealType() { return mealType; }
    public void setMealType(String mealType) { this.mealType = mealType; }

    @Override
    public String toString() {
        return String.format("Destination: %s, Duration: %d days, Price: %.2f, Transport: %s, Meal: %s",
                destination, durationDays, price, transport, mealType);
    }
}