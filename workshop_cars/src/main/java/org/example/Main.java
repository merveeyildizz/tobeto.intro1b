package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1=new Car(1,50,"BMW","Black",15);
        Car car2= new Car(2,45,"Mercedes","White",10);
        Car car3= new Car(3,35,"Peugeot","Red",20);

        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CarManager carManager= new CarManager(new HibernateCarDao(),loggers);
        carManager.add(car1);



    }

}