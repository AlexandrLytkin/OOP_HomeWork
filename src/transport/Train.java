package transport;

import car.Transport;

public class Train extends Transport {
    private double costOfTicket;
    private int timeOfDrive;
    private String startStation;
    private String finishStation;
    private int countOfWagon;


    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double costOfTicket, int timeOfDrive, String startStation, String finishStation, int countOfWagon) {
        super(brand,model,productionYear,productionCountry,color,maxSpeed);
        this.costOfTicket = Double.compare(costOfTicket, 0.0 ) == 0 ? costOfTicket : 1;
        this.timeOfDrive = timeOfDrive;
        this.startStation = startStation;
        this.finishStation = finishStation;
        this.countOfWagon = countOfWagon;
        setMaxSpeed(150);
    }

    @Override
    public void refill() {
        System.out.println("Заправлять ДТ");
    }

    @Override
    public String toString() {
        return "Train{" +
                ", brand= " + getBrand() +
                ", model= " + getModel() +
                ", productionYear= " + getProductionYear() +
                ", productionCountry= " + getProductionCountry() +
                ", color= " + getColor() +
                ", maxSpeed= " + getMaxSpeed() +
                ", costOfTicket= " + costOfTicket +
                ", timeOfDrive= " + timeOfDrive +
                ", startStation= " + startStation + '\'' +
                ", finishStation= " + finishStation + '\'' +
                ", countOfWagon= " + countOfWagon +
                '}';
    }
}
