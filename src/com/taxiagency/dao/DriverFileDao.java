package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DriverFileDao extends FileDao implements DriverDao {

    private File file;
    private String fileName = ".\\src\\com\\taxiagency\\File\\DriverFileDao.txt";

    public DriverFileDao() {
        super.setFile(new File(fileName));
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
