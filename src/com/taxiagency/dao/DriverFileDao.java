package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.io.File;
import java.util.List;

public class DriverFileDao extends FileDao implements DriverDao {

    private File file;
    private String fileName = ".\\src\\com\\taxiagency\\File\\DriverFileDao.txt";

    public DriverFileDao() {
        file = new File(fileName);
    }

    @Override
    public List<Driver> findByName(String name) {
        return null;
    }
}
