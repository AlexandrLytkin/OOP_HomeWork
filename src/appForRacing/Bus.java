package appForRacing;

public class Bus extends Transport implements Participating {

    public Bus(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);

    }

    @Override
    public void typeAuto() {
        System.out.println("автобус");
    }
    @Override
    public void startMoved() {
        System.out.println("начать движение");
    }
    @Override
    public void stopMoved() {
        System.out.println("закончить движение");
    }

    @Override
    public void pitStop(String pitStop) {
    }
    @Override
    public void bestLap(String bestLap) {
    }
    @Override
    public void maxSpeed(String maxSpeed) {
    }

}
