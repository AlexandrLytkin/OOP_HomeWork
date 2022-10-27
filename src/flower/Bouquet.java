package flower;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public double getCost() {
        double sum = 0;
        for (Flower flowers : flowers) {
            if (flowers != null) {
                sum += flowers.getCost();
            }
        }
        return sum + sum * 0.1;
    }

    public int getLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
}
