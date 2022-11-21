package appForRacing;

import validator.ValidationUtils;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public boolean neededDiagnostic() {
        return true;
    }


    public abstract void typeAuto();

    public abstract void startMoved();

    public abstract void stopMoved();


    @Override
    public String toString() {
        return "Транспорт " +
                "Марка= " + getBrand() +
                ", модель= " + getModel() +
                ", обьем двигателя= " + getEngineVolume();
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = ValidationUtils.validOrDefault(model, "default");
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0 ? engineVolume : 1.5;
    }
}
