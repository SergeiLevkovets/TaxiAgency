package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.List;

public interface PassengerDao extends Dao<Passenger> {
    List<Passenger> findByName(String name);

    List<Passenger> findByPhoneRegexp(String phone);
}
