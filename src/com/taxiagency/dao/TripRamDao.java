package com.taxiagency.dao;

import com.taxiagency.domain.*;

import java.util.ArrayList;
import java.util.List;

public class TripRamDao extends RamDao<Trip> implements TripDao {
    @Override
    public List<Trip> findByRoute(String route) {
        Finding<Trip, String> finding = new Finding<>();
        return finding.find(findAll(), route, Trip::getRoute);
    }

    @Override
    public List<Trip> findByDriver(Driver driver) {
        Finding<Trip, Driver> finding = new Finding<>();
        return finding.find(findAll(), driver, Trip::getDriver);
    }

    @Override
    public List<Trip> findByCar(Car car) {
        Finding<Trip, Car> finding = new Finding<>();
        return finding.find(findAll(), car, Trip::getCar);
    }

    @Override
    public List<Trip> findByPassenger(Passenger passenger) {
        Finding<Trip, Passenger> finding = new Finding<>();
        return finding.find(findAll(), passenger, Trip::getPassenger);
    }
}
