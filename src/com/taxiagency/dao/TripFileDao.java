package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Passenger;
import com.taxiagency.domain.Trip;

import java.util.List;

public class TripFileDao extends FileDao implements TripDao{
    @Override
    public List<Trip> findByRoute(String route) {
        return null;
    }

    @Override
    public List<Trip> findByDriver(Driver driver) {
        return null;
    }

    @Override
    public List<Trip> findByCar(Car car) {
        return null;
    }

    @Override
    public List<Trip> findByPassenger(Passenger passenger) {
        return null;
    }
}
