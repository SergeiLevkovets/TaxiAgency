package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRamDao extends RamDao implements DriverDao {

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
