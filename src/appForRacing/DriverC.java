package appForRacing;

import validator.ValidationUtils;

public class DriverC <C extends Transport & Participating> {
    private String name;
    private String driverLicense = "C";
    private int experienceDrive;


    public DriverC(String name, String driverLicense, int experienceDrive) {
        super();
        setName(name);
        setExperienceDrive(experienceDrive);
        setDriverLicense(driverLicense);
    }
    public DriverC(String name) {
        setName(name);
    }

    public void carOfDriver(C vodila){
        System.out.println("ФИО участника = " + getName());
        System.out.println("driverLicense категории = " + driverLicense);
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
                ", driverLicense='" + getDriverLicense() + '\'' +
                ", experienceDrive=" + getExperienceDrive() +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name,"incognito");
    }
    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null || driverLicense.isBlank()) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.driverLicense = driverLicense;
    }

    public int getExperienceDrive() {
        return experienceDrive;
    }
    public void setExperienceDrive(int experienceDrive) {
        this.experienceDrive = Math.max(experienceDrive,1);
    }
}
