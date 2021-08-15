package com.main;

import java.util.ArrayList;
import java.util.List;

public class CabGenerator{

    public static final int COST_PER_KILOMETER = 10;
    public static final int COST_PER_MINUTE =1;
    public static final int MINIMUM_FARE =5;
    public static final int PREMIUM_COST_PER_KILOMETER =15;
    public static final int PREMIUM_COST_PER_MINUTE =2;
    public static final int PREMIUM_MINIMUM_FARE =20;

    public double calculateMyFare(double distance, int time) {
        double result = distance*COST_PER_KILOMETER + time*COST_PER_MINUTE;
        if(result <= MINIMUM_FARE){
            return MINIMUM_FARE;
        } else return result;
    }

    public double calculateMyFare(Ride[] myRides){
        double totalFare = 0;
        for(Ride rides : myRides){
            totalFare += this.calculateMyFare(rides.distance,rides.time);
        } return totalFare;
    }

    public double calculateMyTotalFare(Ride[] myRides){
        double totalFare = 0;
        for(Ride rides : myRides){
            totalFare += this.calculateMyFare(rides.distance,rides.time);
        }
        int numberOfRides = myRides.length;
        double averageFarePerRide = (totalFare/numberOfRides);
        return averageFarePerRide;
    }

    public List invoiceServiceList(Ride[] myRides){
        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(20,40));
        rides.add(new Ride(30,50));
        rides.add(new Ride(40,60));
        return rides;
    }

    public double premiumRides(double distance, int time){
        double result = distance*PREMIUM_COST_PER_KILOMETER+ time*PREMIUM_COST_PER_MINUTE;
        if(result <= PREMIUM_MINIMUM_FARE){
            return PREMIUM_MINIMUM_FARE;
        } else return result;
    }
}
