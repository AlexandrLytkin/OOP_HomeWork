package zoo;

import validator.ValidationUtils;

import java.util.Objects;

public class Mamals extends Animals{
    private String habitat;
    private int speedOfMoved;


    public Mamals(String name, int age,String habitat, int speedOfMoved) {
        super(name, age);
        setHabitat(habitat);
        setSpeedOfMoved(speedOfMoved);
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat, "вальер");
    }

    public int getSpeedOfMoved() {
        return speedOfMoved;
    }
    public void setSpeedOfMoved(int speedOfMoved) {
        if (speedOfMoved != 0) {
            this.speedOfMoved = Math.abs(speedOfMoved);
        } else {
            this.speedOfMoved = 20;
        }
    }

    public void walk() {
        System.out.println("хожу по вальеру");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mamals mamals = (Mamals) o;
        return speedOfMoved == mamals.speedOfMoved && Objects.equals(habitat, mamals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, speedOfMoved);
    }

    @Override
    public String toString() {
        return "Mamals{" +
                "habitat='" + habitat + '\'' +
                ", speedOfMoved=" + speedOfMoved +
                '}';
    }
}
