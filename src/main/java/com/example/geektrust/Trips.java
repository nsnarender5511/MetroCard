package com.example.geektrust;

import java.util.ArrayList;
import java.util.List;

public class Trips {
    List<MetroCard> users = new ArrayList<>();

    void addUser(String cardNo, int balance){
        users.add(new MetroCard(cardNo, balance));
    }

    void addTrip(String cardNo, PasangerType pasangerType, Station sourceStation){
        int kiraya;
        int fees = 0;
        MetroCard user = getUser(cardNo);
        if(checkRoundTrip(user, sourceStation)){
            kiraya = pasangerType.getFare()/2;
            sourceStation.setDiscountGiven(kiraya);
        }else{
            kiraya = pasangerType.getFare();
            sourceStation.Checkins.add(user);
        }

        if(user.getBalance() < kiraya){
            int diff = kiraya - user.getBalance();
            fees = (int) (diff * 0.02);
            user.setBalance(0);
        }else{
            user.setBalance(user.getBalance() - kiraya);
        }

        sourceStation.setTotalCollection(kiraya + fees);
        sourceStation.addNewPassenger(pasangerType);


    }


    MetroCard getUser(String cardNo){
        for(MetroCard user:users){
            if(cardNo.equals(user.getCardNo())){
                return user;
            }
        }
        return null;
    }

    Boolean checkRoundTrip(MetroCard user, Station sourceStation){
        //airport
        if( sourceStation == Station.CENTRAL &&  Station.AIRPORT.Checkins.contains(user)){
            Station.AIRPORT.Checkins.remove(user);
            return true;
        }
        else if(sourceStation == Station.AIRPORT &&  Station.CENTRAL.Checkins.contains(user)){
            Station.AIRPORT.Checkins.remove(user);
            return true;
        }
        return false;
    }
    void DummyPrint(){
        for(MetroCard user:users){
            System.out.println(user.getCardNo() + "  --  " + user.getBalance());
        }
    }
}
