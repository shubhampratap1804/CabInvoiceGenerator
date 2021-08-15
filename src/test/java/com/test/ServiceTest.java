package com.test;

import com.main.CabGenerator;
import com.main.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        CabGenerator cabGenerator = new CabGenerator();
        double distance =10.0;
        int time =5;
        double result = cabGenerator.calculateMyFare(distance,time);
        Assertions.assertEquals(105,result,0.0);
    }
    @Test
    public void givenLessDistance_ShouldReturnMinimumFare(){
        CabGenerator cabGenerator = new CabGenerator();
        double distance = 0.2;
        int time =2;
        double result = cabGenerator.calculateMyFare(distance,time);
        Assertions.assertEquals(5,result,0.0);
    }
    @Test
    public void givenDistanceTimeAndDays_ShouldReturnTotalIncome(){
       CabGenerator cabGenerator = new CabGenerator();
       Ride[] myRides = {new Ride(20,40),new Ride(30,50),new Ride(40,60)};
       double result = cabGenerator.calculateMyFare(myRides);
       Assertions.assertEquals(1050,result,0.0);
    }

    @Test
    public void givenDistanceTimeAndRides_ShouldReturnAllData(){
        CabGenerator cabGenerator = new CabGenerator();
        Ride[] myRides = {new Ride(20,40), new Ride(30,50), new Ride(40,60)};
        double result = cabGenerator.calculateMyTotalFare(myRides);
        Assertions.assertEquals(350,result,0.0);
    }
}
