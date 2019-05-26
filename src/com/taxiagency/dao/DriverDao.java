package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

import java.util.List;

public interface DriverDao extends Dao{

   List<Driver> findByName(String name);
}
