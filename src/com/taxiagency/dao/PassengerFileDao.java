package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PassengerFileDao extends FileDao implements PassengerDao {

    private File file;
    private String fileName = ".\\src\\com\\taxiagency\\File\\PassengerFileDao.txt";

    public PassengerFileDao() {
        super.setFile(new File(fileName));
    }

    @Override
    public List<Passenger> findByName(String name) {
        return find(name, Passenger::getName);
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String phone) {
        return find(phone, Passenger::getMobilePhone);
    }

    private List<Passenger> find(String findBy, Function<Passenger, String> getData) {
        List<Passenger> list = findAll();
        List<Passenger> Passengers = new ArrayList<>();
        for (Passenger passenger : list) {
            if (getData.apply(passenger).equals(findBy)) {
                Passengers.add(passenger);
            }
        }
        return Passengers;
    }

}
