package zoo;

import validator.ValidationUtils;

public class NoFlyAnimals extends Birds {

    private final String typeMoved;

    public NoFlyAnimals (String name,int age, String habitat,String typeMoved) {
        super(name, age, habitat);
        this.typeMoved = ValidationUtils.validOrDefault(typeMoved, "не умеет летать");
    }

    public void walk () {
        System.out.println("я хожу");
    }

    public String getTypeMoved() {
        return typeMoved;
    }

    @Override
    public String toString() {
        return "нелетающий " +
                ", имя: " + getName() +
                ", возраст: " + getAge() +
                ", среда проживания: " + getHabitat() +
                ", способ передвижения: " + typeMoved;
    }
}
