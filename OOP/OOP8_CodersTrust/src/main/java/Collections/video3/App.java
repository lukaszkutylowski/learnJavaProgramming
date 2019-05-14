package Collections.video3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
        Bike bike3 = new Bike();

        List<Bike> bikes = new ArrayList<>();
        bikes.add(bike1);
        bikes.add(bike2);
        bikes.add(bike3);

        // ----- comparator inside class ----- //

        Comparator<? super String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
        System.out.println("COMPARATOR INSIDE CLASS");
        queue.add("very long");
        queue.add("short");
        queue.add("qu long");

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }

        // ----- comparator in outside class MyComparator ----- //

        Comparator<String> myComparator = new MyComparator();
        PriorityQueue<String> queue1 = new PriorityQueue<>(10, myComparator);
        System.out.println("MYCOMPARATOR CLASS");
        queue.add("advertisement");
        queue.add("ad");
        queue.add("advert");

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }

        // ----- sort Set ----- //

        Set<String> set = new TreeSet<>(myComparator);
        System.out.println("SORT SET - TREE SET WITH COMPARATOR");
        set.add("sehenwirdugkeiten");
        set.add("sehen");
        set.add("sehenwurdig");
        set.add("Aachen");
        set.add("Akwizgran");
        set.add("Berlin");
        set.add("Monachium");

        for (String element: set) {
            System.out.println(element);
        }

        // ----- HashSet ----- //

        Set<String> hashSet = new HashSet<>();

    }
}
