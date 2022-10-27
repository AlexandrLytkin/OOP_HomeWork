package human;

public class Human {
    private int yearOfBirth;
    public String name;
    private String city;
    public String job;

    public Human(){
        this(0,"Информация не указана","Информация не указана","Информация не указана");
    }
    public Human(int yearOfBirth, String name, String city, String job) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.name = valueOrDefault(name, "Информация не указана");
        this.city = valueOrDefault(city, "Информация не указана");
        this.job = valueOrDefault(job, "Информация не указана");
    }

    public int getYearOfBirth() {
        return  yearOfBirth;
    }
    public void setYearOfBirth (int yearOfBirth) {
        if (yearOfBirth == 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
    this.valueOrDefault(city, "Информация не указана");
    }

    public String valueOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public String toString() {
        return "Привет! Меня зовут "+name+" Я из города "+city+". Я родился в "+yearOfBirth+" году. Я работаю на должности "+job+". Будем знакомы!";
    }
}
