package appForRacing;

public class Bus extends Transport implements Participating {

    public Bus(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);
    }



    public enum Capacity {
        ESPECIAL_SMALL(0, 10),
        SMALL(0, 25),
        MID(40,50),
        BIG(60,80),
        ESPECIAL_BIG(100,120);

        private int capacityFrom;
        private int capacityOn;

        Capacity(int capacityFrom, int capacityOn){
            this.capacityFrom = capacityFrom;
            this.capacityOn = capacityOn;
        }

        public int getCapacityFrom() {
            return capacityFrom;
        }

        public void setCapacityFrom(int capacityFrom) {
            this.capacityFrom = capacityFrom;
        }

        public int getCapacityOn() {
            return capacityOn;
        }

        public void setCapacityOn(int capacityOn) {
            this.capacityOn = capacityOn;
        }
    }

    public void capacity(Capacity capacity){
        switch (capacity){
            case ESPECIAL_SMALL:
                System.out.println("особо маленькая от "+Capacity.ESPECIAL_SMALL.capacityFrom+" до "+Capacity.ESPECIAL_SMALL.capacityOn+" мест");
                break;
            case SMALL:
                System.out.println("маленькая от "+Capacity.SMALL.capacityFrom+" до "+Capacity.SMALL.capacityOn+" мест");
                break;
            case MID:
                System.out.println("средняя от "+Capacity.MID.capacityFrom+" до "+Capacity.MID.capacityOn+" мест");
                break;
            case BIG:
                System.out.println("большая от "+Capacity.BIG.capacityFrom+" до "+Capacity.BIG.capacityOn+" мест");
                break;
            case ESPECIAL_BIG:
                System.out.println("особо большая от 100 "+Capacity.ESPECIAL_BIG.capacityFrom+" до "+Capacity.ESPECIAL_BIG.capacityOn+" мест");
                break;
            default:
                System.out.println("данных по авто недостаточно");
        }
    }

    @Override
    public boolean neededDiagnostic() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+"  в диагностике не требуется");
        return true;
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
        System.out.println("требуется питстоп "+pitStop);
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
