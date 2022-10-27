package transport;

import car.Transport;
import validator.ValidationUtils;

import java.security.Key;
import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String gearBox;
    private final String bodyType;
    private String regNumber;
    private final int countSeatPlace;
    private boolean winterTires;

    private final Key key;

    private final Insurance insurance;


    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double engineVolume, String gearBox, String bodyType, String regNumber, int countSeatPlace, boolean winterTires, Key key, Insurance insurance) {
        super(brand,model,productionYear,productionCountry,color,maxSpeed);


        this.bodyType = ValidationUtils.validOrDefault(bodyType, "седан");
        this.countSeatPlace = Math.max(countSeatPlace, 1);
        this.key = new Key(true, true);
        this.insurance = new Insurance(LocalDate.now().plusMonths(3), 6500, "123456789");
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        setGearBox(gearBox);
        setRegNumber(regNumber);

        this.winterTires = winterTires;
    }
//-
    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 10;
    }
//-
//--
    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }
    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }
    private boolean isNumberLetter(char symbol) {
        String allowedSymbol = "ETYOPAHKXCBM";
        return allowedSymbol.contains("" + symbol);
    }
//--
//---
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0 ? engineVolume : 1.5;
    }
    public String getGearBox() {
        return gearBox;
    }
    public void setGearBox(String gearBox) {
        this.gearBox = ValidationUtils.validOrDefault(gearBox, "механика");
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "х000хх000");
    }
    public int getCountSeatPlace() {
        return countSeatPlace;
    }
    public boolean isWinterTires() {
        return winterTires;
    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }
//---
//----
    @Override
    public String toString() {
        return "Car{" +
                ", brand= " + getBrand() +
                ", model= " + getModel() +
                ", productionYear= " + getProductionYear() +
                ", productionCountry= " + getProductionCountry() +
                ", color= " + getColor() +
                ", maxSpeed= " + getMaxSpeed() +
                ", engineVolume=" + engineVolume +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", countSeatPlace=" + countSeatPlace +
                ", winterTires=" + winterTires +
                ", key.remoteEngineStart=" + key.isRemoteEngineStart() +
                ", key.keyLessAccess=" + key.isKeyLessAccess() +
                '}';
    }
//----
//-----
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }
//-----
//------
    public static class Insurance {
        private final LocalDate validity;
        private final double costInsurance;
        private final String numberInsurance;

        public Insurance(LocalDate validity, double costInsurance, String numberInsurance) {
            this.validity = validity != null ? validity : LocalDate.now().plusDays( 10);
            this.costInsurance = Math.max(costInsurance, 1);
            this.numberInsurance = numberInsurance != null ? numberInsurance : "default";
        }

        public boolean isNumberCorrect() {
            return numberInsurance.length() == 9;
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validity); // является ли сегодняшняя дата от текущего установленого
        }
    }
//------
//-------
    @Override
    public void refill() {
        System.out.println("Заправлять бензином АИ-95");
    }
//-------
}
