package appForRacing;

public class Bus extends Transport implements Participating {

    public Bus(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);
    }

    public enum Capacity {
        ESPECIAL_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25)"),
        MID("средняя (40-50)"),
        BIG("большая (60-80)"),
        ESPECIAL_BIG("особо большая (100-120 мест)");

        private String capacity;

        Capacity(String capacity){
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
        public void setCapacity(String capacity){
            this.capacity = capacity;
        }
    }

    public void capacity(Capacity capacity){
        switch (capacity){
            case ESPECIAL_SMALL:
                System.out.println(Capacity.ESPECIAL_SMALL.capacity);
                break;
            case SMALL:
                System.out.println(Capacity.SMALL.capacity);
                break;
            case MID:
                System.out.println(Capacity.MID.capacity);
                break;
            case BIG:
                System.out.println(Capacity.BIG.capacity);
                break;
            case ESPECIAL_BIG:
                System.out.println(Capacity.ESPECIAL_BIG.capacity);
                break;
            default:
                System.out.println("данных по авто недостаточно");
        }
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
