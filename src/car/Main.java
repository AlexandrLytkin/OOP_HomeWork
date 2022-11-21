package car;

import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi",
                "A8",
                2020,
                "Germany",
                "Black",
                2020,
                3.0,
                "автомат",
                "седан",
                "M001MM011 ",
                0,
                true,
                new Car.Key(true,true),
                new Car.Insurance(
                        LocalDate.now().plusMonths(3),
                        1500.50 ,
                        "123456789"));
        if (!car.getInsurance().isInsuranceValid()) {
            System.out.println("страховка просрочена ");
        }
        System.out.println("car = " + car);
        car.refill();

        Train train1 = new Train("Ласточка", "B-901", 2011, "России", null, 301,3500,0,"Белорусского вокзала","Минск-Пассажирский",11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия", null, 270,1700,0,"Ленинградского вокзала","Ленинград-Пассажирский",8);
        Train train3 = new Train();
        System.out.println("train1 = " + train1);
        train1.refill();
        System.out.println("train2 = " + train2);
        train2.refill();
        System.out.println("train3 = " + train3);
        train3.refill();


        Bus bus1 = new Bus("ПАЗ", "П-97", 2001, "России", null, 120);
        Bus bus2 = new Bus("ГАЗ", "Г-06", 1995, "России", null, 90);
        Bus bus3 = new Bus("Икарус", "И-105", 2005, "России", null, 180);
        System.out.println("bus1 = " + bus1);
        bus1.refill();
        System.out.println("bus2 = " + bus2);
        bus2.refill();
        System.out.println("bus3 = " + bus3);
        bus3.refill();
    }
}
