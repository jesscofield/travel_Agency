package com.travelagency.model;

public class TreatmentTrip extends Trip {
    private boolean includesMedicalConsultation;

    public TreatmentTrip(String destination, int durationDays, double price, String transport, String mealType, boolean includesMedicalConsultation) {
        super(destination, durationDays, price, transport, mealType);
        this.includesMedicalConsultation = includesMedicalConsultation;
    }

    public boolean isIncludesMedicalConsultation() { return includesMedicalConsultation; }
    public void setIncludesMedicalConsultation(boolean includesMedicalConsultation) { this.includesMedicalConsultation = includesMedicalConsultation; }

    @Override
    public String toString() {
        return super.toString() + String.format(", Includes Medical Consultation: %b", includesMedicalConsultation);
    }
}