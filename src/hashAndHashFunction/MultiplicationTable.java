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
            for (int j = 0; j < 8; j++) {
                stringSet.add(list1.get(i)+" * "+list2.get(j)+" = "+ list1.get(i)* list2.get(j));
            }
        }


        for (int i = 0; i < stringSet.size();i++) {
            if (stringSet.contains("2 * 3 = 6")) {
                stringSet.remove("3 * 2 = 6");
            }
            if (stringSet.contains("2 * 4 = 8")) {
                stringSet.remove("4 * 2 = 8");
            }
            if (stringSet.contains("2 * 5 = 10")) {
                stringSet.remove("5 * 2 = 10");
            }
            if (stringSet.contains("2 * 6 = 12")) {
                stringSet.remove("6 * 2 = 12");
            }
            if (stringSet.contains("2 * 7 = 14")) {
                stringSet.remove("7 * 2 = 14");
            }
            if (stringSet.contains("2 * 8 = 16")) {
                stringSet.remove("8 * 2 = 16");
            }
            if (stringSet.contains("2 * 9 = 18")) {
                stringSet.remove("9 * 2 = 18");
            }
            if (stringSet.contains("3 * 4 = 12")) {
                stringSet.remove("4 * 3 = 12");
            }
            if (stringSet.contains("3 * 5 = 15")) {
                stringSet.remove("5 * 3 = 15");
            }
            if (stringSet.contains("3 * 6 = 18")) {
                stringSet.remove("6 * 3 = 18");
            }
            if (stringSet.contains("3 * 7 = 21")) {
                stringSet.remove("7 * 3 = 21");
            }
            if (stringSet.contains("3 * 8 = 24")) {
                stringSet.remove("8 * 3 = 24");
            }
            if (stringSet.contains("3 * 9 = 27")) {
                stringSet.remove("9 * 3 = 27");
            }
            if (stringSet.contains("4 * 5 = 20")) {
                stringSet.remove("5 * 4 = 20");
            }
            if (stringSet.contains("4 * 6 = 24")) {
                stringSet.remove("6 * 4 = 24");
            }
            if (stringSet.contains("4 * 7 = 28")) {
                stringSet.remove("7 * 4 = 28");
            }
            if (stringSet.contains("4 * 8 = 32")) {
                stringSet.remove("8 * 4 = 32");
            }
            if (stringSet.contains("4 * 9 = 36")) {
                stringSet.remove("9 * 4 = 36");
            }
            if (stringSet.contains("5 * 6 = 30")) {
                stringSet.remove("6 * 5 = 30");
            }
            if (stringSet.contains("5 * 7 = 35")) {
                stringSet.remove("7 * 5 = 35");
            }
            if (stringSet.contains("5 * 8 = 40")) {
                stringSet.remove("8 * 5 = 40");
            }
            if (stringSet.contains("5 * 9 = 45")) {
                stringSet.remove("9 * 5 = 45");
            }
            if (stringSet.contains("6 * 7 = 42")) {
                stringSet.remove("7 * 6 = 42");
            }
            if (stringSet.contains("6 * 8 = 48")) {
                stringSet.remove("8 * 6 = 48");
            }
            if (stringSet.contains("6 * 9 = 54")) {
                stringSet.remove("9 * 6 = 54");
            }
            if (stringSet.contains("7 * 8 = 56")) {
                stringSet.remove("8 * 7 = 56");
            }
            if (stringSet.contains("7 * 9 = 63")) {
                stringSet.remove("9 * 7 = 63");
            }
            if (stringSet.contains("8 * 9 = 72")) {
                stringSet.remove("9 * 8 = 72");
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
