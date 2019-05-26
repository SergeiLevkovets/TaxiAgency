package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.List;

public class CarFileDao extends FileDao implements CarDao{

    String fileName = "com/taxiagency/File/CarFileDao.txt";

    public CarFileDao(String fileName) {
        super(fileName);
    }

    @Override
    public List<Car> findByNumber(String number) {
        return null;
    }

    @Override
    public List<Car> findByColor(Color color) {
        return null;
    }
}
