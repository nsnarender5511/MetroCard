package com.example.geektrust;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public enum Station {
    CENTRAL(0, 0, new HashSet<>()),
    AIRPORT(0, 0, new HashSet<>());

    int totalCollection;
    int discountGiven;

    HashSet<MetroCard> Checkins;

    Map<PasangerType, Integer> PasengerCount;

    Station(int totalCollection, int discountGiven, HashSet<MetroCard> checkins) {
        this.totalCollection = totalCollection;
        this.discountGiven = discountGiven;
        Checkins = checkins;
        this.PasengerCount = new HashMap<>();
        this.PasengerCount.put(PasangerType.ADULT, 0);
        this.PasengerCount.put(PasangerType.SENIOR_CITIZEN, 0);
        this.PasengerCount.put(PasangerType.KID, 0);
    }

    public void addNewPassenger(PasangerType pasangerType){
        this.PasengerCount.put(pasangerType, this.PasengerCount.get(pasangerType) + 1);
    }

    public int getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(int totalCollection) {
        this.totalCollection += totalCollection;
    }

    public int getDiscountGiven() {
        return discountGiven;
    }

    public void setDiscountGiven(int discountGiven) {
        this.discountGiven += discountGiven;
    }

    public HashSet<MetroCard> getCheckins() {
        return Checkins;
    }

    public void setCheckins(HashSet<MetroCard> checkins) {
        Checkins = checkins;
    }

    public Map<PasangerType, Integer> getPasengerCount() {
        return PasengerCount;
    }

    public void setPasengerCount(Map<PasangerType, Integer> pasengerCount) {
        PasengerCount = pasengerCount;
    }

    @Override
    public String toString() {
/*        return "Station{" +
                "totalCollection=" + totalCollection +
                ", discountGiven=" + discountGiven +
                ", Checkins=" + Checkins +
                '}';*/

        String Printable =  "TOTAL_COLLECTION " + name() + " " + totalCollection + " " + discountGiven + "\n"
                + "PASSENGER_TYPE_SUMMARY";

        if(PasengerCount.get(PasangerType.ADULT) != 0) Printable += "\nADULT "+ PasengerCount.get(PasangerType.ADULT);
        if(PasengerCount.get(PasangerType.KID) != 0) Printable += "\nKID "+ PasengerCount.get(PasangerType.KID);
        if(PasengerCount.get(PasangerType.SENIOR_CITIZEN) != 0) Printable += "\nSENIOR_CITIZEN "+ PasengerCount.get(PasangerType.SENIOR_CITIZEN);

        return Printable;
    }
}
