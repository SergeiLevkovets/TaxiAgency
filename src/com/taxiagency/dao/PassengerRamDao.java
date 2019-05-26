package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerRamDao extends RamDao implements PassengerDao{
    @Override
    public List<Passenger> findByName(String name) {
        List<Passenger> list = findAll();
        List<Passenger> Passengers = new ArrayList<>();
        for (Passenger d : list){
            if (d.getName().equals(name)){
                Passengers.add(d);
            }
        }
        return Passengers;
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        List<Passenger> list = findAll();
        List<Passenger> Passengers = new ArrayList<>();
        for (Passenger d : list){
            if (d.getMobilePhone().equals(phone)){
                Passengers.add(d);
            }
        }
        return Passengers;
    }
}
