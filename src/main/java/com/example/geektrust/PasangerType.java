package com.example.geektrust;

public enum PasangerType {
    ADULT(200),
    SENIOR_CITIZEN(100),
    KID(50);

    int fare;

    PasangerType(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
