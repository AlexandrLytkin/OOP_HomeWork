package appForRacing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Car> list1 = new HashSet<>();
        Set <Truck> list2 = new HashSet<>();
        Set <Bus> list3 = new HashSet<>();

        Car car1 = new Car("Lada", "Priora", 1.6);
        Car car2 = new Car("ZAZ", "965", 0.7);
        Car car3 = new Car("VAZ", "2106", 1.6);
        Car car4 = new Car("Lada", "1111", 0.6);
        Truck truck1 = new Truck("KAMAZ", "740-60", 11.76);
        Truck truck2 = new Truck("MAZ", "5551", 11.5);
        Truck truck3 = new Truck("URAL", "4320", 14.9);
        Truck truck4 = new Truck("BELAZ", "75600", 77.6);
        Bus bus1 = new Bus("PAZ", "3205", 4.67);
        Bus bus2 = new Bus("LIAZ", "4292", 4.43);
        Bus bus3 = new Bus("GAZ", "53", 4.2);
        Bus bus4 = new Bus("KAVZ", "4238", 6.7);

        list1.add(car1);
        list2.add(truck1);
        list2.add(truck2);
        list3.add(bus1);

        System.out.println(car1);
        System.out.println(truck1);
        System.out.println(bus1);

        System.out.println("-----------");

        Set <DriverB> driverBList = new HashSet<>();
        Set <DriverC> driverCList = new HashSet<>();
        Set <DriverD> driverDList = new HashSet<>();

        DriverB<Car> driverB1 = new DriverB<>("Иванов Иван Иванович", "B", 35);
        DriverC<Truck> driverB2 = new DriverC<>("Гарыныч", "C", 27);
        DriverD<Bus> driverB3 = new DriverD<>("Сигизмунд", "D",15);

        driverB1.carOfDriver(car1);
        driverB2.carOfDriver(truck1);
        driverB3.carOfDriver(bus1);

        driverBList.add(driverB1);
        driverCList.add(driverB2);
        driverDList.add(driverB3);

        System.out.println(driverBList);
        System.out.println(driverCList);
        System.out.println(driverDList);

        checkNeededDiagnostic(car1,car2,car3,car4,truck1,truck2,truck3,truck4,bus1,bus2,bus3,bus4);
        Set<Mechanic> mechanicSet = new HashSet<>();
        Mechanic<Car> mechanic1 = new Mechanic<>("Михалыч", "Garage");
        Mechanic<Truck> mechanic2 = new Mechanic<>("Потапыч", "AngarCO");
        Mechanic<Bus> mechanic3 = new Mechanic<>("Андрей Альбертович", "FixPro");
        mechanicSet.add(mechanic1);
        mechanicSet.add(mechanic2);
        mechanicSet.add(mechanic3);
        System.out.println("mechanicSet = " + mechanicSet);

        mechanic1.maintenance(car1);
        tryFixedTransport(mechanic1);
        mechanic2.maintenance(truck1);
        tryFixedTransport(mechanic2);
        mechanic3.maintenance(bus1);
        tryFixedTransport(mechanic3);

        System.out.println("-----------");

        Set<Sponsor> sponsorList = new HashSet<>();
        Sponsor <Car> sponsor1 = new Sponsor<>("F1",150_000);
        Sponsor <Truck> sponsor2 = new Sponsor<>("XXLargeCompany",500_000);
        sponsorList.add(sponsor1);
        sponsorList.add(sponsor2);
        sponsorList.add(sponsor2);
        System.out.println(sponsor1);
        System.out.println(sponsor2);

        System.out.println("-----------");

        StationFix<Car> garage = new StationFix<>("Garage");
        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);
        garage.addCar(car4);

        garage.fixTransport();

        System.out.println("-----------");

        System.out.println("-----далее коменты и тесты для себя-----");
        car1.pitStop("у меня неисправность");
        car1.bestLap(3.58);
        car1.maxSpeed(139);
        System.out.println("-----------");
        car1.typeCar(Car.AllBodyType.COUPE); // первый способ вывода в консоль
        Car.AllBodyType.COUPE.setTranslation("no coupe");  // cетер меняет данные
        car1.typeCar(Car.AllBodyType.COUPE); // COUPE сменился no coupe
        System.out.println("-----------");
        car1.typeCar(Car.AllBodyType.valueOf("SUV")); // второй способ вывода в консоль
        truck1.weightType(Truck.CarryingCapacity.N2);
        bus1.capacity(Bus.Capacity.ESPECIAL_SMALL);
        //car1.typeCar(Car.AllBodyType.valueOf("no SEDAN"));  // рушит идею

        System.out.println("-----------");


    }


    public static void tryFixedTransport(Mechanic... mechanics) {
        for (Mechanic currentTransport : mechanics) {
            try {
                if (!currentTransport.fixTransport()) {
                    throw new RuntimeException("ремонт автомобился неудался ");
                } else {
                    System.out.println("то пройдено");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkNeededDiagnostic(Transport... transport) {
        for (Transport currentTransport : transport) {
            try {
                if (currentTransport.neededDiagnostic() != true) {
                    throw new RuntimeException("диагностику не прошел " + currentTransport.getBrand() + " " + currentTransport.getModel());
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}

