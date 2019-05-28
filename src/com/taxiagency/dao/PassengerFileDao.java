package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.io.File;
import java.util.List;

public class PassengerFileDao extends FileDao implements PassengerDao {

    private File file;
    private String fileName = ".\\src\\com\\taxiagency\\File\\PassengerFileDao.txt";

    public PassengerFileDao() {
        file = new File(fileName);
    }

    @Override
    public List<Passenger> findByName(String name) {
        return null;
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        return null;
    }
}
