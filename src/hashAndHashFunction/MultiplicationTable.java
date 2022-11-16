package hashAndHashFunction;

import java.util.*;

public class MultiplicationTable {

    static LinkedList<Integer> list1 = getFirstNumber();
    static LinkedList<Integer> list2 = getSecondNumber();

    static List<String> stringSet = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                stringSet.add(list1.get(i)+" * "+list2.get(j)+" = "+ list1.get(i)* list2.get(j));
            }
        }

        System.out.println(" " +stringSet);
        System.out.println("stringSet.size() = " + stringSet.size());

        Random rand = new Random();
        int numberOfElement = 15;
        for (int i = 0; i < numberOfElement; i++) {
            int randomIndex = rand.nextInt(stringSet.size());
            String randomElement = stringSet.get(randomIndex);
            stringSet.remove(randomIndex);
            System.out.println(randomElement);

        }
    }


    public static LinkedList<Integer> getFirstNumber() {
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 2; i < 10; i++) {
            list1.add(i);
        }
        return list1;
    }

    public static LinkedList<Integer> getSecondNumber() {
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 2; i < 10; i++) {
            list2.add(i);
        }
        return list2;
    }


}
