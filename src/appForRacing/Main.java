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
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);
//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(bus4);
//        System.out.println(truck1);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);
        DriverB<Car> driverB1 = new DriverB<>("Иванов Иван Иванович", null, 35);
        DriverC<Truck> driverB2 = new DriverC<>("Гарыныч", "B", 27);
        DriverD<Bus> driverB3 = new DriverD<>(null, null, 29);
        driverB1.carOfDriver(car1);
        driverB2.carOfDriver(truck1);
        driverB3.carOfDriver(bus1);
    }
}
