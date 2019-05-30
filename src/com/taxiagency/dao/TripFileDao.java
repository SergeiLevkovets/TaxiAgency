package com.taxiagency.dao;

import com.taxiagency.domain.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TripFileDao extends FileDao implements TripDao {

    public TripFileDao() {
        super(".\\src\\com\\taxiagency\\File\\TripFileDao.txt");
    }

    @Override
    protected Entity createFromString(String str) {
        return new Trip(str);
    }

    @Override
    public List<Trip> findByRoute(String route) {
        List<Trip> list = findAll();
        List<Trip> trips = new ArrayList<>();
        for (Trip trip : list) {
            if (trip.getRoute().equals(route)) {
                trips.add(trip);
            }
        }
        return trips;
    }

    @Override
    public List<Trip> findByDriver(Driver driver) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip trip : list) {
            if (trip.getDriver().equals(driver)) {
                Trips.add(trip);
            }
        }
        return Trips;
    }

    @Override
    public List<Trip> findByCar(Car car) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip trip : list) {
            if (trip.getCar().equals(car)) {
                Trips.add(trip);
            }
        }
        return Trips;
    }

    @Override
    public List<Trip> findByPassenger(Passenger passenger) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip trip : list) {
            if (trip.getPassenger().equals(passenger)) {
                Trips.add(trip);
            }
        }
        return Trips;
    }

}
