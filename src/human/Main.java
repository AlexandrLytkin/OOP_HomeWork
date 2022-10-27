package human;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1985,"Maxim",  "Minsk", "бренд-менеджером");
        Human anya = new Human(1993,"Anya","Moskov","методистом образовательных программ");
        Human katya = new Human(1992, "Katya", "Калининград", "продакт-менеджером");
        Human artyom = new Human(1995,"Artyom", "Moskov", "директором по развитию бизнеса");
        Human vladimir = new Human(2001, "Vladimir", "Kazan", null);
        System.out.println("maxim = " + maxim);
        System.out.println("anya = " + anya);
        System.out.println("katya = " + katya);
        System.out.println("artyom = " + artyom);
        System.out.println("vladimir = " + vladimir);
    }
}
