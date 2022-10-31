package appForRacing;

import validator.ValidationUtils;

public class DriverD <D extends Transport & Participating> {
    private String name;
    private final static String DRIVER_LICENSE = "D";
    private int experienceDrive;


    public DriverD(String name, String DRIVER_LICENSE, int experienceDrive) {
        super();
        setName(name);
        setExperienceDrive(experienceDrive);
    }
    public DriverD(String name) {
        setName(name);
    }

    public void carOfDriver(D vodila){
        System.out.println("ФИО участника = " + getName());
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

