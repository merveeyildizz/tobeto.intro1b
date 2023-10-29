package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao, Logger[] loggers) {
        this.carDao = carDao;
        this.loggers=loggers;
    }

    public void add(Car car) throws Exception {
        if(car.getPrice()<40){
            throw new Exception("Ürün fiyatı 40 dan küçük olamaz");

        }
        if(car.getStock()<12){
            throw new Exception("Stok sayısı 12'den az olamaz");
        }



            carDao.add(car);
        for(Logger logger : loggers){
            logger.log(car.getBrand());
        }


    }
}
