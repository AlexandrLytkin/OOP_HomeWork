package farmerMarket;

import java.util.*;

public class Recipe {

//    private static Map<Product, Set<Recipe> >map = new HashMap<>();
    private final String nameRecipe;
    private double totalCost;
    private Set<Product> productSet;


    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;

    }

    public double costRecipe(Product product1, Product product2) {
        double sumRecipe;
            sumRecipe = (product1.getCost() * product1.getWeight()) + (product2.getCost() * product2.getWeight());
            totalCost = sumRecipe;
        return sumRecipe;
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
        return Objects.hash(getNameRecipe(), getTotalCost(), getProductSet());
    }
    public String getNameRecipe() {
        return nameRecipe;
    }
    public double getTotalCost() {
        return totalCost;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }
}
