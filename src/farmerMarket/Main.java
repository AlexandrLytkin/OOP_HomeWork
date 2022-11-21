package farmerMarket;

import java.util.*;

public class Main {

    static List<Recipe> recipeSet = new ArrayList<>();
    static Map<Product,Double> map = new HashMap<>();

    public static void main(String[] args) {

        Product potato = new Product("картофель", 49.99,1);
        Product bread = new Product("хлеб", 39.99, 1);
        Product sosage = new Product("калбаса", 59.99, 1);
        Product butter = new Product("масло", 35.99, 1);


        Recipe sandwich = new Recipe("бутерброд");
        Recipe sandwich2 = new Recipe("бутерброд2");
        Recipe grill = new Recipe("гриль");
        Recipe fry = new Recipe("жареха");


        recipeSet.add(sandwich);
        recipeSet.add(sandwich2);
        recipeSet.add(grill);
        recipeSet.add(fry);
////        addRecipe(grill);
//        for (Recipe r : recipeSet) {
//            System.out.println(r);
//        }


        addInBasket(butter, 1d);
        addInBasket(potato, 1d);
        addInBasket(butter, 3d);
        addInBasket(bread, 1d);
        addInBasket(sosage, 1d);
        addInBasket(sosage, 1d);
        Set<Product> products = map.keySet();
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("map = " + map);

        fry.getProduct(potato,2);
        fry.getProduct(butter,1);
        System.out.println("fry.getTotalCost() = " + fry.getTotalCost());

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

    public static void addInBasket(Product product,Double qty) {
        map.merge(product,qty,(v1,v2)->{
            System.out.println("v1 = " + v1);
            System.out.println("v2 = " + v2);
            return v1+v2;
        });
    }



    public static void addRecipe(Recipe recipe) {
        for (Recipe currentProduct: recipeSet) {
            if (recipe.equals(currentProduct)) {
                throw new RuntimeException("такой рецепт уже есть: ");
            }
        }
    }
}
