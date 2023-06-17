package org.example;

import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user=new User("demo1","demo@gmail.com","24");
        User user1=new User("demo2","demo2@gmail.com","26");
        Vehicle vehicle=new Vehicle("car","swift","up79H5372");
        offerRide offerRide=new offerRide(user,vehicle,3,"banglore","mysore","9:00","3:00");
        RideSharingService rideSharingService=new RideSharingService();
        rideSharingService.addRide(offerRide);
        offerRide offerRide1 = rideSharingService.searchByOriginAndDestination("banglore", "mysore");
        System.out.println(offerRide1.getVehicle().getName());
        Vehicle vehicle1 = rideSharingService.selectVehicle(offerRide1, user1);
        offerRide offerRideListForUser = rideSharingService.getOfferRideListForUser(user);
        System.out.println(offerRideListForUser.getUser().getName());


    }
}