package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.List;

public interface CarDao extends Dao{
    List<Car> findByNumber(String number);
    List<Car> findByColor(Color color);
}
