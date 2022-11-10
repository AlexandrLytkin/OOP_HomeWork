package appForRacing;

import java.util.LinkedList;
import java.util.Queue;

public class StationFix<T extends Transport> {
    private String name;

    public StationFix(String name) {
        this.name = name;
    }

    private Queue<T> queue = new LinkedList<>();


    public void addCar(T transport) {
        queue.offer(transport);
    }

    public void fixTransport() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("станция ТО: " + name + ", чиним: " + transport);
            fixTransport();
        } else {
            System.out.println("список пусть все машины проверены");
        }
    }

    public int queueSize() {
        return queue.size();
    }

    public String getName() {
        return name;
    }
}
