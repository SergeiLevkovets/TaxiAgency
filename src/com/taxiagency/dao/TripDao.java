package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Passenger;
import com.taxiagency.domain.Trip;

import java.util.List;

public interface TripDao extends Dao{
    List<Trip> findByRoute(String route);
    List<Trip> findByDriver(Driver driver);
    List<Trip> findByCar(Car car);
    List<Trip> findByPassenger(Passenger passenger);

}
