package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.util.List;

public class DriverFileDao extends FileDao implements DriverDao{
    @Override
    public List<Driver> findByName(String name) {
        return null;
    }
}
