package com.taxiagency.domain;

public class Trip implements Entity{
    private String id;
    private String route;
    private Driver driver;
    private Car car;
    private Passenger passenger;
    private int durationMins;
    private int distance;

    public Trip(String id,
                String route,
                Driver driver,
                Car car,
                Passenger passenger,
                int durationMins,
                int distance) {
        this.id = id;
        this.route = route;
        this.driver = driver;
        this.car = car;
        this.passenger = passenger;
        this.durationMins = durationMins;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                "; route: " + route +
                "; driver: " + driver +
                "; car: " + car +
                "; passenger: " + passenger +
                "; durationMins: " + durationMins +
                "; distance: " + distance ;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
