package transport;

import car.Transport;

public class Bus extends Transport {


    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);


    }

    @Override
    public void refill() {
        System.out.println("Заправлять дизельным топливом ");
    }

    @Override
    public String toString() {
        return "Bus{" +
                ", brand= " + getBrand() +
                ", model= " + getModel() +
                ", productionYear= " + getProductionYear() +
                ", productionCountry= " + getProductionCountry() +
                ", color= " + getColor() +
                ", maxSpeed= " + getMaxSpeed() +
                '}';
    }
}
