package Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("first string");
        list.add("second string");
        list.add("second string");

        System.out.println(list);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(3, "Wednesday");
        map.put(3, "Wednesday");
        map.put(3, "Wednesday");
        map.put(3, "Wednesday");
        map.put(4, "Tursday");
        map.put(5, "Friday");
        map.put(6, "Saturday");
        map.put(7, "Sunday");

        System.out.println(map);
        System.out.println(map.get(3));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);

        Queue<Item> queue = new PriorityQueue<>();
        queue.add(new Item(1));
        queue.add(new Item(3));
        queue.add(new Item(2));

        System.out.println(queue);
    }

    private static class Item implements Comparable<Item> {
        int element;

        Item(int value) {
            this.element = value;
        }

        @Override
        public String toString() {
            return "" + element;
        }

        public int compareTo(Item o) {
            return element - o.element;
        }
    }
}
