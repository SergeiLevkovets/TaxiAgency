package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import java.util.List;

public interface DriverDao extends Dao<Driver> {

    List<Driver> findByName(String name);
}
