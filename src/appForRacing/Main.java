package appForRacing;

public class Main {
    public static void main(String[] args) {
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

        DriverB<Car> driverB1 = new DriverB<>("Иванов Иван Иванович", "B", 35);
        DriverC<Truck> driverB2 = new DriverC<>("Гарыныч", "C", 27);
        DriverD<Bus> driverB3 = new DriverD<>(null);
        driverB1.carOfDriver(car1);
        driverB2.carOfDriver(truck1);
        driverB3.carOfDriver(bus1);
        System.out.println("-----------");
        checkNeededDiagnostic(car1,car2,car3,car4,truck1,truck2,truck3,truck4,bus1,bus2,bus3,bus4);

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

    public static void checkNeededDiagnostic(Transport... transport) {
        for (Transport currentTransport : transport) {
            try {
                if (currentTransport.neededDiagnostic() != true) {
                    throw new RuntimeException("диагностику не прошел "+ currentTransport.getBrand() + " " + currentTransport.getModel());
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}

