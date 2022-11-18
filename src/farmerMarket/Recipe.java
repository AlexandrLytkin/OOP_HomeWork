package farmerMarket;

import java.util.*;

public class Recipe < T extends Product> {

    private final String nameRecipe;
    private double totalCost;
    private List<Product> products;


    public Recipe(String nameRecipe,List<Product>products) {
        this.nameRecipe = nameRecipe;
        this.products = products;

    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", totalCost=" + totalCost +
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
        return Objects.hash(getNameRecipe());
    }


    public String getNameRecipe() {
        return nameRecipe;
    }

    public double getTotalCost() {
        for (int i = 0; i < products.size(); i++) {
            totalCost+=products.get(i).getCost();
        }

        return totalCost;
    }

    public List<Product> getProducts() {
        return products;
    }

    
}
