package zoo;

import validator.ValidationUtils;

public class FlyAnimals extends Birds {
    private final String typeMoved;

    public FlyAnimals (String name,int age, String habitat,String typeMoved) {
        super(name, age, habitat);
        this.typeMoved = ValidationUtils.validOrDefault(typeMoved, "умеет летать");
    }

    public void walk () {
        System.out.println("я лечу");
    }

    public String getTypeMoved() {
        return typeMoved;
    }

    @Override
    public String toString() {
        return "летающее " +
                ", имя: " + getName() +
                ", возраст: " + getAge() +
                ", среда проживания: " + getHabitat() +
                ", способ передвижения: " + typeMoved;
    }
}
