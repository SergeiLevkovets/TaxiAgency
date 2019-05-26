package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

public class DriverFileDao extends FileDao implements DriverDao{
    @Override
    public Driver findByName(String name) {
        return null;
    }
}
