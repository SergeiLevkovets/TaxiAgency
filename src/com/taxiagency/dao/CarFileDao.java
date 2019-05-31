package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;
import com.taxiagency.domain.Entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CarFileDao extends FileDao<Car> implements CarDao {

    public CarFileDao() {
        super(".\\src\\com\\taxiagency\\File\\CarFileDao.txt");
    }

    @Override
    protected Car createFromString(String str) {
        return new Car(str);
    }

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
