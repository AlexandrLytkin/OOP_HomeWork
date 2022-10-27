package flower;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(null, "Holand", 35.59, 0);
        Flower hrizantema = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "England", 69.9, 1);
        Flower hipsifila = new Flower(null, "Turkay", 19.5, 10);

        System.out.println("rose: " + rose);
        System.out.println("hrizantema: " + hrizantema);
        System.out.println("pion: " + pion);
        System.out.println("hrizantema: " + hrizantema);

        Bouquet bouquet = new Bouquet(hrizantema,rose,rose,rose);    //метод через отдельный класс
        System.out.println("bouquet.getCost() = " + bouquet.getCost());  //вызов метода через
        System.out.println("bouquet.getLifeSpan() = " + bouquet.getLifeSpan()); //вызов метода
    }
}
