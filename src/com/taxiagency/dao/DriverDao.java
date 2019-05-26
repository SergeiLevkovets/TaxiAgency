package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

public interface DriverDao extends Dao{

   Driver findByName(String name);
}
