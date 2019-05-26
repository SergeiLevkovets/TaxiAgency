package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.List;

public class PassangerFileDao extends FileDao implements PassengerDao {

    String fileName = "com/taxiagency/File/PassengerFileDao.txt";

    @Override
    public List<Passenger> findByName(String name) {
        return null;
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        return null;
    }
}
