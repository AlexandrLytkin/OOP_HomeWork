package appForRacing;

public class Truck extends Transport implements Participating {

    public Truck(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);
    }

    public enum CarryingCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private String carryingCapacity;

        CarryingCapacity(String carryingCapacity) {
            this.carryingCapacity = carryingCapacity;
        }

        public String getCarryingCapacity() {
            return carryingCapacity;
        }
    }

    public void weightType(CarryingCapacity carryingCapacity){
        switch (carryingCapacity) {
            case N1:
                System.out.println("с полной массой до 3,5 тонн");
                break;
            case N2:
                System.out.println("с полной массой свыше 3,5 до 12 тонн");
                break;
            case N3:
                System.out.println("с полной массой свыше 12 тонн");
                break;
        }
    }


    @Override
    public void typeAuto() {
        System.out.println("грузовик");
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
        System.out.println(pitStop);
    }
    @Override
    public void bestLap(double bestLap) {
        System.out.println("лучший круг мин.сек. "+bestLap);
    }
    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("максимальная скорость км.ч "+ maxSpeed);
    }
}
