package com.taxiagency.dao;

import com.taxiagency.domain.Entity;
import com.taxiagency.domain.Passenger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PassengerFileDao extends FileDao implements PassengerDao{

    public PassengerFileDao() {
        super(".\\src\\com\\taxiagency\\File\\PassengerFileDao.txt");
    }

    @Override
    protected Entity createFromString(String str) {
        return new Passenger(str);
    }

    @Override
    public List<Passenger> findByName(String name) {
        return find(name, Passenger::getName);
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        return find(phone, Passenger::getMobilePhone);
    }

    private List<Passenger> find(String findBy, Function<Passenger, String> getData) {
        List<Passenger> list = findAll();
        List<Passenger> passengers = new ArrayList<>();
        for (Passenger passenger : list) {
            if (getData.apply(passenger).equals(findBy)) {
                passengers.add(passenger);
            }
        }
        return passengers;
    }
}
