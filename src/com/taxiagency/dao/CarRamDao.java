package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.ArrayList;
import java.util.List;

public class CarRamDao extends RamDao implements CarDao {
    @Override
    public List<Car> findByNumber(String number) {
        List<Car> list = findAll();
        List<Car> cars = new ArrayList<>();
        for (Car car : list) {
            if (car.getNumber().equals(number)) {
                cars.add(car);
            }
        }
        return cars;
    }

    @Override
    public List<Car> findByColor(Color color) {
        List<Car> list = findAll();
        List<Car> cars = new ArrayList<>();
        for (Car car : list) {
            if (car.getColor().equals(color)) {
                cars.add(car);
            }
        }
        return cars;
    }


}
