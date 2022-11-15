package farmerMarket;

import java.util.HashSet;

import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String nameRecipe;

    private double totalCost;

    private Set<Product> productSet;

    public Recipe(String nameRecipe, double totalCost, Set<Product> productSet) {
        this.nameRecipe = nameRecipe;
        this.totalCost = totalCost;
        this.productSet = productSet;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", totalCost=" + totalCost +
                ", productSet=" + productSet +
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
