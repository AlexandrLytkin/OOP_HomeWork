package zoo;

import validator.ValidationUtils;

public class Predator extends Mamals{

    private final String typeFood;

    public Predator(String name, int age, String habitat, int speedOfMoved, String typeFood) {
        super(name, age , habitat, speedOfMoved);
        this.typeFood = ValidationUtils.validOrDefault(typeFood, "мясо");
    }

    public String getTypeFood() {
        return typeFood;
    }


    public void graze() {
        System.out.println("я гуляю и охочусь");
    }

    @Override
    public String toString() {
        return "хищник" +
                ", имя: " + getName() +
                ", возраст: " + getAge() +
                ", среда проживания: " + getHabitat() +
                ", максимальная скорость: " + getSpeedOfMoved() +
                ", тип еды: " + getTypeFood();
    }
}
