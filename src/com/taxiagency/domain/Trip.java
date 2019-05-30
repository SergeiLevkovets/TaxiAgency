package com.taxiagency.domain;

import com.taxiagency.dao.CarFileDao;
import com.taxiagency.dao.DriverFileDao;
import com.taxiagency.dao.FileDao;
import com.taxiagency.dao.PassengerFileDao;

import java.io.Serializable;
import java.util.Objects;

public class Trip implements Entity, Serializable {
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

    public Trip(String str) {
        String[] splited = str.split(";");
        String idPart = splited[0];
        this.id = idPart.substring(idPart.indexOf(":") + 1).trim();
        String routePart = splited[1];
        this.route = routePart.substring(routePart.indexOf(":") + 1).trim();
        String driverPart = splited[2];
        this.driver = (Driver) new DriverFileDao().findById(driverPart.substring(driverPart.indexOf(":") + 1).trim());
        String carPart = splited[3];
        this.car = (Car) new CarFileDao().findById(carPart.substring(carPart.indexOf(":") + 1).trim());
        String passengerPart = splited[4];
        this.passenger =(Passenger) new PassengerFileDao().findById(passengerPart.substring(passengerPart.indexOf(":") + 1).trim());
        String durationMinsPart = splited[5];
        this.durationMins = Integer.parseInt(durationMinsPart.substring(durationMinsPart.indexOf(":") + 1).trim());
        String distancePart = splited[6];
        this.distance = Integer.parseInt(distancePart.substring(distancePart.indexOf(":") + 1).trim());
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                        "; route: " + route +
                        "; driver: " + driver.getId() +
                        "; car: " + car.getId() +
                        "; passenger: " + passenger.getId() +
                        "; durationMins: " + durationMins +
                        "; distance: " + distance;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return durationMins == trip.durationMins &&
                distance == trip.distance &&
                Objects.equals(id, trip.id) &&
                Objects.equals(route, trip.route) &&
                Objects.equals(driver, trip.driver) &&
                Objects.equals(car, trip.car) &&
                Objects.equals(passenger, trip.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, route, driver, car, passenger, durationMins, distance);
    }
}
