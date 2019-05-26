package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Passenger;
import com.taxiagency.domain.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripRamDao extends RamDao implements TripDao{
    @Override
    public List<Trip> findByRoute(String route) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip d : list){
            if (d.getRoute().equals(route)){
                Trips.add(d);
            }
        }
        return Trips;
    }

    @Override
    public List<Trip> findByDriver(Driver driver) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip d : list){
            if (d.getDriver().equals(driver)){
                Trips.add(d);
            }
        }
        return Trips;
    }

    @Override
    public List<Trip> findByCar(Car car) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip d : list){
            if (d.getCar().equals(car)){
                Trips.add(d);
            }
        }
        return Trips;
    }

    @Override
    public List<Trip> findByPassenger(Passenger passenger) {
        List<Trip> list = findAll();
        List<Trip> Trips = new ArrayList<>();
        for (Trip d : list){
            if (d.getPassenger().equals(passenger)){
                Trips.add(d);
            }
        }
        return Trips;
    }
}
