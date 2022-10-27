package flower;

import validator.ValidationUtils;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor,String country,double cost,int lifeSpan) {
        this.flowerColor = ValidationUtils.validOrDefault(flowerColor, "белый");
        this.country = ValidationUtils.validOrDefault(country, "Russia");
        if (Double.compare(cost, 0) == 0) {
            this.cost = 1;
        } else {
            this.cost = Math.abs(cost);
        }
        if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        this.flowerColor = ValidationUtils.validOrDefault(flowerColor,"White");
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, "Russia");
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = Math.max(lifeSpan, 3);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + getFlowerColor() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", cost=" + getCost() +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
