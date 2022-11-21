package zoo;

import validator.ValidationUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public abstract class Animals {
    private final String name;
    private int age;

    public Animals(String name) {
        this(name, 0);
    }

    public Animals(String name, int age) {
        this.name = ValidationUtils.validOrDefault(name, "животное");
        setAge(age);
    }

    public void eat() {
        System.out.println("Положить корм согласно типу животного");

    }
    public void sleep() {
        System.out.println("Выключить свет");

    }
    public void go() {
        System.out.println("открыть клетку");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = Math.abs(age);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getAge() == animals.getAge() && Objects.equals(getName(), animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

}
