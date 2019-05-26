package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

public interface PassengerDao extends Dao<Passenger>{
    Passenger findByName(String name);
    Passenger findByPhoneRegexp(String phone);
}
