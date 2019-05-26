package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Passenger;
import com.taxiagency.domain.Trip;

public interface TripDao extends Dao<Trip>{
    Trip findByRoute(String route);
    Trip findByDriver(Driver driver);
    Trip findByCar(Car car);
    Trip findByPassenger(Passenger passenger);

}
