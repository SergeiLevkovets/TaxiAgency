package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.ArrayList;
import java.util.List;

public class CarRamDao extends RamDao<Car> implements CarDao {
    @Override
    public List<Car> findByNumber(String number) {
        Finding<Car, String> finding = new Finding<>();
        return finding.find(findAll(), number, Car::getNumber);
    }

    @Override
    public List<Car> findByColor(Color color) {
        Finding<Car, Color> finding = new Finding<>();
        return finding.find(findAll(), color, Car::getColor);
    }


}
