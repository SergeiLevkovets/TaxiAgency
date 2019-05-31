package com.taxiagency.dao;

import com.taxiagency.domain.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TripFileDao extends FileDao<Trip> implements TripDao {

    public TripFileDao() {
        super(".\\src\\com\\taxiagency\\File\\TripFileDao.txt");
    }

    @Override
    protected Trip createFromString(String str) {
        return new Trip(str);
    }

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
