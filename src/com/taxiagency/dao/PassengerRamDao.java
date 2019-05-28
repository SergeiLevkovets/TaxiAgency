package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerRamDao extends RamDao implements PassengerDao {
    @Override
    public List<Passenger> findByName(String name) {
        List<Passenger> list = findAll();
        List<Passenger> Passengers = new ArrayList<>();
        for (Passenger passenger : list) {
            if (passenger.getName().equals(name)) {
                Passengers.add(passenger);
            }
        }
        return Passengers;
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        List<Passenger> list = findAll();
        List<Passenger> Passengers = new ArrayList<>();
        for (Passenger passenger : list) {
            if (passenger.getMobilePhone().equals(phone)) {
                Passengers.add(passenger);
            }
        }
        return Passengers;
    }
}
