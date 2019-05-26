package com.taxiagency;

import com.taxiagency.dao.*;
import com.taxiagency.dao.DriverRamDao;
import com.taxiagency.dao.RamDao;
import com.taxiagency.domain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("1dr", "Driver1");
        Driver driver2 = new Driver("2dr", "Driver2");
        Driver driver3 = new Driver("3dr", "Driver3");
        Driver driver4 = new Driver("4dr", "Driver4");
        Driver driver5 = new Driver("5dr", "Driver3");

        DriverRamDao driverDao = new DriverRamDao();
        driverDao.save(driver1);
        driverDao.save(driver2);
        driverDao.save(driver3);
        driverDao.save(driver4);
        driverDao.save(driver5);

        List<Driver> drivers = driverDao.findAll();
        System.out.println(drivers);
        System.out.println(driverDao.findByName("Driver3"));
        System.out.println(driverDao.getRam());

        Passenger passenger1 = new Passenger("1pas", "Passenger1", "80298056637");
        Passenger passenger2 = new Passenger("2pas", "Passenger2", "80298056638");
        Passenger passenger3 = new Passenger("3pas", "Passenger3", "80298056639");
        PassengerRamDao passengerRamDao = new PassengerRamDao();
        passengerRamDao.save(passenger1);
        passengerRamDao.save(passenger2);
        passengerRamDao.save(passenger3);

        List<Passenger> passengers = passengerRamDao.findAll();
        System.out.println(passengers);
        System.out.println(passengerRamDao.findByName("Passenger2"));
        System.out.println(passengerRamDao.findByPhoneRegexp("80298056637"));
        System.out.println(passengerRamDao.getRam());

        Car car1 = new Car("1car", Color.BLACk, "am45271");
        Car car2 = new Car("2car", Color.YELLOW, "am45272");
        Car car3 = new Car("3car", Color.RED, "am45273");

        CarRamDao carRamDao = new CarRamDao();
        carRamDao.save(car1);
        carRamDao.save(car2);
        carRamDao.save(car3);

        List<Car> cars = carRamDao.findAll();
        System.out.println(cars);
        System.out.println(carRamDao.findByColor(Color.YELLOW));
        System.out.println(carRamDao.findByNumber("am45271"));
        System.out.println(carRamDao.getRam());

        Trip trip1 = new Trip("1t", "Minsk", driver1, car1, passenger1, 1, 10);
        Trip trip2 = new Trip("2t", "Pinsk", driver2, car2, passenger2, 2, 100);
        Trip trip3 = new Trip("3t", "Gdansk", driver3, car3, passenger3, 3, 300);

        TripRamDao tripRamDao = new TripRamDao();
        tripRamDao.save(trip1);
        tripRamDao.save(trip2);
        tripRamDao.save(trip3);

        List<Trip> trips = tripRamDao.findAll();
        System.out.println(trips);
        System.out.println(tripRamDao.findByCar(car2));
        System.out.println(tripRamDao.findByDriver(driver2));
        System.out.println(tripRamDao.findByPassenger(passenger1));
        System.out.println(tripRamDao.getRam());
        
    }
}
