package appForRacing;

public final class Car extends Transport implements Participating {

    public Car(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);

    }

    @Override
    public void typeAuto() {
        System.out.println("легковой");
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
