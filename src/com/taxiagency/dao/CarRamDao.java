package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.ArrayList;
import java.util.List;

public class CarRamDao extends RamDao implements CarDao{
    @Override
    public List<Car> findByNumber(String number) {
        List<Car> list = findAll();
        List<Car> cars = new ArrayList<>();
        for (Car d : list){
            if (d.getNumber().equals(number)){
                cars.add(d);
            }
        }
        return cars;
    }

    @Override
    public List<Car> findByColor(Color color) {

        List<Car> list = findAll();
        List<Car> cars = new ArrayList<>();
        for (Car d : list){
            if (d.getColor().equals(color)){
                cars.add(d);
            }
        }
        return cars;
    }


}
