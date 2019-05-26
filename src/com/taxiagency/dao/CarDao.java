package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

public interface CarDao extends Dao<Car>{
    Car findByNumber(String number);
    Car findByColor(Color color);
}
