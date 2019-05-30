package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DriverFileDao extends FileDao implements DriverDao {



    public DriverFileDao() {
        super(".\\src\\com\\taxiagency\\File\\DriverFileDao.txt");
    }

    @Override
    protected Entity createFromString(String str) {
        return new Driver(str);
    }

    @Override
    public List<Driver> findByName(String name) {
        List<Driver> list = findAll();
        List<Driver> drivers = new ArrayList<>();
        for (Driver driver : list) {
            if (driver.getName().equals(name)) {
                drivers.add(driver);
            }
        }
        return drivers;
    }
}
