package passport;


import java.util.*;

public class Passport {
//    private Set<Passport>passportSet = new HashSet<>();
//    private Map<String,Integer> map = new HashMap<String, Integer>();
    private int numberPassport;
    private String name;
    private String sureName;
    private String patronymic;
    private int dateOfBirthday;

    public Passport(int numberPassport, String name, String sureName, String patronymic, int dateOfBirthday) {
        this.numberPassport = numberPassport;
        this.name = name;
        this.sureName = sureName;
        this.patronymic = patronymic;
        this.dateOfBirthday = dateOfBirthday;
    }


    @Override
    public String toString() {
        return "Passport{" +
                //"passportSet=" + passportSet +
                ", numberPassport=" + numberPassport +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Passport passport = (Passport) o;
        return Objects.equals(passport.numberPassport, numberPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberPassport(), getName(), getSureName(), getPatronymic(), getDateOfBirthday());
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }
}

