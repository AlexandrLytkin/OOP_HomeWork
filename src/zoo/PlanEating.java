package zoo;

import validator.ValidationUtils;

public class PlanEating extends Mamals {
    private final String typeFood;

    public PlanEating(String name, int age, String habitat, int speedOfMoved, String typeFood) {
        super(name, age, habitat, speedOfMoved);
        this.typeFood = ValidationUtils.validOrDefault(typeFood, "растения");
    }

    public String getTypeFood() {
        return typeFood;
    }


    public void graze() {
        System.out.println("я гуляю и кормлюсь");
    }


    @Override
    public String toString() {
        return "травоядное" +
                ", имя: " + getName() +
                ", возраст: " + getAge() +
                ", среда проживания: " + getHabitat() +
                ", максимальная скорость: " + getSpeedOfMoved() +
                ", тип еды: " + getTypeFood();
    }
}
