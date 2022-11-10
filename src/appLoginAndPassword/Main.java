package appLoginAndPassword;

public class Main {
    public static void main(String[] args) {

        boolean registration = Data.valid("Kaschey-2000", "qwe123", "qwe123");
        if (registration) {
            System.out.println("регистрация прошла уcпешно");
        } else {
            System.out.println("регистрация не прошла");
        }
    }
}
