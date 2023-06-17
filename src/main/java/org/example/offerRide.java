package org.example;

public class offerRide {
    User user;
    Vehicle vehicle;
    Integer seatsAvailable;
    String origin;
    String destination;
    String start;
    String timeDuration;

    public offerRide(User user, Vehicle vehicle, Integer seatsAvailable, String origin, String destination, String start, String timeDuration) {
        this.user = user;
        this.vehicle = vehicle;
        this.seatsAvailable = seatsAvailable;
        this.origin = origin;
        this.destination = destination;
        this.start = start;
        this.timeDuration = timeDuration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Integer seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
    }
}