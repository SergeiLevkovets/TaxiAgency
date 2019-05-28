package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.io.File;
import java.util.List;

public class CarFileDao extends FileDao implements CarDao {

    private File file;
    private String fileName = ".\\src\\com\\taxiagency\\File\\CarFileDao.txt";

    public CarFileDao() {
        file = new File(fileName);
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
