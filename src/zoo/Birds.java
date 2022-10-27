package zoo;

import validator.ValidationUtils;

import java.util.Objects;

public class Birds extends Animals {
    private String habitat;

    public Birds (String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public void hunting() {
        System.out.println("я на охоте");
    }

    public String getHabitat() {
        return  habitat;
    }
    public void setHabitat (String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat, "улица");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(getHabitat(), birds.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHabitat());
    }
}
