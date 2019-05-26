package com.taxiagency.dao;

import com.taxiagency.domain.*;

import java.util.List;

public interface TripDao extends Dao {

    List<Trip> findByRoute(String route);

    List<Trip> findByDriver(Driver driver);

    List<Trip> findByCar(Car car);

    List<Trip> findByPassenger(Passenger passenger);

}
