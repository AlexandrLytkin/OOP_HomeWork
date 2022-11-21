package farmerMarket;

import java.util.*;

public class Recipe < T extends Product> {

    private final String nameRecipe;
    private Map<Product, Integer> products = new HashMap<>();


    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public void getProduct(Product product, int qty) {
        if (qty <= 0) {
            qty = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + qty);
        } else {
            this.products.put(product, qty);
        }
    }

    public double getTotalCost() {
        double sum = 0;
        for (Map.Entry<Product, Integer> product : this.products.entrySet()){
            sum += product.getKey().getCost()* product.getValue();
        }
        return sum;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipe.nameRecipe, nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }
}
