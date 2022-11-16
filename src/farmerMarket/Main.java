package farmerMarket;

import java.util.*;

public class Main {

    static Set<Product> productSet = new HashSet<>();
    static List<Recipe> recipeSet = new ArrayList<>();
    static HashMap<Product,Integer> map = new HashMap<>();

    public static void main(String[] args) {

        Product potato = new Product("картофель", 49.99,1);
        Product bread = new Product("хлеб", 39.99, 1);
        Product sosage = new Product("калбаса", 59.99, 1);
        Product butter = new Product("масло", 49.99, 1);

        productSet.add(potato);
        productSet.add(bread);
        productSet.add(sosage);
        productSet.add(butter);
//        addInBasket(potato);
        for (Product p : productSet) {
            System.out.println(p);
        }

        Recipe sandwich = new Recipe("бутерброд");
        Recipe sandwich2 = new Recipe("бутерброд2");
        Recipe grill = new Recipe("гриль");
        Recipe fry = new Recipe("жареха");

        System.out.println("sandwich.costRecipe(bread, butter) = " + sandwich.costRecipe(bread, butter));


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
//        System.out.println("integerList = " + integerList);

        ListIterator<Integer> iterator = integerList.listIterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item % 2 != 0) {
                iterator.remove();
            }
        }
//        System.out.println("integerList = " + integerList);
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
