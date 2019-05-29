package com.taxiagency;

import com.taxiagency.dao.*;
import com.taxiagency.domain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("1dr", "Driver1");
        Driver driver2 = new Driver("2dr", "Driver2Upsert");
        Driver driver3 = new Driver("3dr", "Driver3");

/*
        DriverRamDao driverDao = new DriverRamDao();
        driverDao.save(driver1);
        driverDao.save(driver2);
        driverDao.save(driver3);

        List<Driver> drivers = driverDao.findAll();
        System.out.println(drivers);
        System.out.println(driverDao.findByName("Driver3"));
        System.out.println(driverDao.getRam());
*/

        Passenger passenger1 = new Passenger("1pas", "Passenger1", "80298056637");
        Passenger passenger2 = new Passenger("2pas", "Passenger2", "80298056638");
        Passenger passenger3 = new Passenger("3pas", "Passenger3", "80298056639");

/*
        PassengerRamDao passengerRamDao = new PassengerRamDao();
        passengerRamDao.save(passenger1);
        passengerRamDao.save(passenger2);
        passengerRamDao.save(passenger3);

        List<Passenger> passengers = passengerRamDao.findAll();
        System.out.println(passengers);
        System.out.println(passengerRamDao.findByName("Passenger2"));
        System.out.println(passengerRamDao.findByPhoneRegexp("80298056637"));
        System.out.println(passengerRamDao.getRam());
*/

        Car car1 = new Car("1car", Color.BLACK, "am45271");
        Car car2 = new Car("2car", Color.YELLOW, "am45272");
        Car car3 = new Car("3car", Color.RED, "am45273");

/*
        CarRamDao carRamDao = new CarRamDao();
        carRamDao.save(car1);
        carRamDao.save(car2);
        carRamDao.save(car3);

        List<Car> cars = carRamDao.findAll();
        System.out.println(cars);
        System.out.println(carRamDao.findByColor(Color.YELLOW));
        System.out.println(carRamDao.findByNumber("am45271"));
        System.out.println(carRamDao.getRam());
*/

        Trip trip1 = new Trip("1t", "Minsk", driver1, car1, passenger1, 10, 10);
        Trip trip2 = new Trip("2t", "Pinsk", driver2, car2, passenger2, 70, 100);
        Trip trip3 = new Trip("3t", "Gdansk", driver3, car3, passenger3, 240, 300);

/*
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
*/


        //Сохранение в файл

        FileDao<Driver> fileDao = new FileDao<>();
        fileDao.save(driver1);
        fileDao.save(driver2);

//        System.out.println(fileDao.findById("1dr"));
//        System.out.println(fileDao.findAll());

        DriverFileDao driverFileDao = new DriverFileDao();
        driverFileDao.save(driver1);
        driverFileDao.save(driver2);

        CarFileDao carFileDao = new CarFileDao();
        carFileDao.save(car1);
        carFileDao.save(car2);

        PassengerFileDao passangerFileDao = new PassengerFileDao();
        passangerFileDao.save(passenger1);
        passangerFileDao.save(passenger2);

        TripFileDao tripFileDao = new TripFileDao();
        tripFileDao.save(trip1);
        tripFileDao.save(trip2);

    }
}
