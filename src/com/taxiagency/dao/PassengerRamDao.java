package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerRamDao extends RamDao<Passenger> implements PassengerDao {
    @Override
    public List<Passenger> findByName(String name) {
        Finding<Passenger, String> finding = new Finding<>();
        return finding.find(findAll(), name, Passenger::getName);
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        Finding<Passenger, String> finding = new Finding<>();
        return finding.find(findAll(), phone, Passenger::getMobilePhone);
    }
}
