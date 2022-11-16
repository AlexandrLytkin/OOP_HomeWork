package farmerMarket;

import java.util.Objects;

public class Product {

    private String name;
    private double cost;
    private double weight;

    public Product(String name, double cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;

    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(product.getName(), getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost(), getWeight());
    }



    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

}

