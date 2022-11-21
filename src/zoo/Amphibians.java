package zoo;

import validator.ValidationUtils;

import java.util.Objects;

public class Amphibians extends Animals {
    private String habitat;

    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat, "пруд");
    }

    public void hunting() {
        System.out.println("я на охоте");
    }

    @Override
    public String toString() {
        return "преноводный" +
                ", возраст: " + getName() +
                ", возраст: " + getAge() +
                ", среда проживания: " + getHabitat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getHabitat(), that.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHabitat());
    }
}
