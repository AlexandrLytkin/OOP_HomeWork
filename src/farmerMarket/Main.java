package farmerMarket;

import java.util.*;

public class Main {

    static Set<Product> productSet = new HashSet<>();
    static List<Recipe> recipeSet = new ArrayList<>();

    public static void main(String[] args) {

        Product potato = new Product("молоко", 49.99,0.5);
        Product bread = new Product("хлеб", 39.99, 0.4);
        Product sosage = new Product("калбаса", 59.99, 0.3);
        Product butter = new Product("масло", 49.99, 0.4);
        productSet.add(potato);
        productSet.add(bread);
        productSet.add(sosage);
        productSet.add(bread);
        //addInBasket(potato);
        for (Product p : productSet) {
            System.out.println(p);
        }

        Recipe sandwich = new Recipe("бутерброд",150, Set.of(bread,butter));
        Recipe sandwich2 = new Recipe("бутерброд2",150, Set.of(bread,butter));
        Recipe grill = new Recipe("гриль",250, Set.of(bread,sosage));
        Recipe fry = new Recipe("жареха",360, Set.of(potato,sosage));
        recipeSet.add(sandwich);
        recipeSet.add(sandwich2);
        recipeSet.add(grill);
        recipeSet.add(fry);
        //addRecipe(grill);
        for (Recipe r : recipeSet) {
            System.out.println(r);
        }
//task 2.3
        ArrayList<Integer> integerList = new ArrayList<>();
        Integer[] arr = new Integer[30];

        for (int i = 0; i < arr.length;i++) {
            arr[i] = (int) (Math.random() * (1000 + 1));//
        }
        Collections.addAll(integerList, arr);
        System.out.println("integerList = " + integerList);

        ListIterator<Integer> iterator = integerList.listIterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("integerList = " + integerList);
    }


    public static void addInBasket(Product product) {
        for (Product currentProduct: productSet) {
            if (product.equals(currentProduct)) {
                throw new RuntimeException("этот товар уже есть! ");
            } else {
                productSet.add(product);
            }
        }
    }



    public static void addRecipe(Recipe recipe) {
        for (Recipe currentProduct: recipeSet) {
            if (recipe.equals(currentProduct)) {
                throw new RuntimeException("такой рецепт уже есть: ");
            }
        }
    }
}
