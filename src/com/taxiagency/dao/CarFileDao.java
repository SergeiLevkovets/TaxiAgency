package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;
import com.taxiagency.domain.Entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CarFileDao extends FileDao implements CarDao {

    public CarFileDao() {
        super(".\\src\\com\\taxiagency\\File\\CarFileDao.txt");
    }

    @Override
    protected Entity createFromString(String str) {
        return new Car(str);
    }

    @Override
    public List<Car> findByNumber(String number) {
        file.getName();
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
