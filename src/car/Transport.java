package car;

import validator.ValidationUtils;

public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor("White");
        this.maxSpeed = maxSpeed;
    }

    public abstract  void refill();

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

    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "White");
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = Math.abs(maxSpeed);
        }
    }
}
