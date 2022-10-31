package appForRacing;

import validator.ValidationUtils;

public class DriverB <B extends Transport & Participating> {
    private String name;
    private  final String DRIVER_LICENSE = "B";
    private int experienceDrive;


    public DriverB(String name, String DRIVER_LICENSE, int experienceDrive) {
        super();
        setName(name);
        setExperienceDrive(experienceDrive);
    }
    public DriverB() {
    }

    public void carOfDriver(B vodila){
        System.out.println("водитель = " + getName());
        System.out.println("DRIVER_LICENSE категории = " + DRIVER_LICENSE);
        System.out.println(
                "управляет автомобилем= " + vodila.getBrand() +
                ", модель= " + vodila.getModel() +
                ", обьем двигателя= " + vodila.getEngineVolume() +
                ", будет участвовать в заезде!"
                );
    }

    public void startDrive() {
        System.out.println("начать движение ");
    }

    public void stopped() {
        System.out.println("остановится");
    }

    public void refuel() {
        System.out.println("заправить авто");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + getName() + '\'' +
                ", driverLicense='" + getDRIVER_LICENSE() + '\'' +
                ", experienceDrive=" + getExperienceDrive() +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name,"incognito");
    }
    public String getDRIVER_LICENSE() {
        return DRIVER_LICENSE;
    }
    public int getExperienceDrive() {
        return experienceDrive;
    }
    public void setExperienceDrive(int experienceDrive) {
        this.experienceDrive = Math.max(experienceDrive,1);
    }
}
