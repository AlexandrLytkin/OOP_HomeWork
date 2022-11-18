package farmerMarket;

import java.util.Objects;

public class Product {

    private String name;
    private double cost;
    private double qty;

    public Product(String name, double cost, double qty) {
        this.name = name;
        this.cost = cost;
        this.qty = qty;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + qty +
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
        return Objects.hash(getName());
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getQty() {
        return qty;
    }

}

