package hashAndHashFunction;

import java.util.LinkedList;
import java.util.ListIterator;

public class Number {
    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();

        System.out.println("list = " + list);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item %2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("list = " + list);
    }


    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) Math.round(Math.random() * 1000));
        }
        return list;
    }
}
