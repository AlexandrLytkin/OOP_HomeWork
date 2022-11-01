package appForRacing;

import java.util.Arrays;

public final class Car extends Transport implements Participating {

    public Car(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);

    }

    public enum AllBodyType {
        SEDAN("седан"),
        HATCHBACK("хетчбек"),
        COUPE("купе"),
        UNIVERSAL("универсал"),
        SUV("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивен");

        private String translation;

        AllBodyType(String translation) {
            this.translation = translation;
        }

        public String getTranslation() {
            return translation;
        }
        public void setTranslation(String translation) {
            this.translation = translation;
        }
    }

    public void typeCar(AllBodyType typeCar) {
        switch (typeCar){
            case SEDAN:
                System.out.println(AllBodyType.SEDAN.translation);
                break;
            case HATCHBACK:
                System.out.println(AllBodyType.HATCHBACK.translation);
                break;
            case COUPE:
                System.out.println(AllBodyType.COUPE.translation);
                break;
            case UNIVERSAL:
                System.out.println(AllBodyType.UNIVERSAL.translation);
                break;
            case SUV:
                System.out.println(AllBodyType.SUV.translation);
                break;
            case CROSSOVER:
                System.out.println(AllBodyType.CROSSOVER.translation);
                break;
            case PICKUP:
                System.out.println(AllBodyType.PICKUP.translation);
                break;
            case VAN:
                System.out.println(AllBodyType.VAN.translation);
                break;
            case MINIVAN:
                System.out.println(AllBodyType.MINIVAN.translation);
                break;
            default:
                System.out.println("данных по авто недостаточно");
        }
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
