package org.example;

import java.util.*;

public class RideSharingService {
    public static List<offerRide>offerRideList=new ArrayList<>();

    static Map<User,offerRide> offerRideListForUser=new HashMap<>();
    Map<User,offerRide>rideTookByUser=new HashMap<>();
    List<User>userList=new ArrayList<>();
    public void addRide(offerRide offerRide){
        offerRideList.add(offerRide);
    }
    public offerRide searchByOriginAndDestination(String origin,String destination){
        for(offerRide offerRide:offerRideList){
            if(offerRide.getOrigin().equalsIgnoreCase(origin) && offerRide.getDestination().equalsIgnoreCase(destination)){
                System.out.println("got the match");
                Vehicle vehicle=offerRide.getVehicle();
            //    System.out.println(vehicle.getVehicle());
                return offerRide;
            }
        }
        return offerRideList.get(0);
    }
    public Vehicle selectVehicle(offerRide offerRide,User user){
        offerRideListForUser.put(offerRide.getUser(),offerRide);
        rideTookByUser.put(user,offerRide);
        Vehicle selectedVehicle=offerRide.getVehicle();
        return selectedVehicle;
    }
    public offerRide getOfferRideListForUser(User user){
        return offerRideListForUser.get(user);
    }
    public void  addUser(User user){
        userList.add(user);
    }
}
