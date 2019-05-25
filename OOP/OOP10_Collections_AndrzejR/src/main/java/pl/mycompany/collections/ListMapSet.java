package pl.mycompany.collections;

import java.util.*;

public class ListMapSet {

    public static void main(String[] args) {
        System.out.println("-------------------- List --------------------");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        System.out.println("size: " + arrayList.size());

        for (String s : arrayList) {
            System.out.println(s);
        }

        arrayList.add(1, "zero");

        System.out.println("size: " + arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(1);

        System.out.println("size: " + arrayList.size());

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("contains two?: " + arrayList.contains("two"));
        System.out.println("contains zero?: " + arrayList.contains("zero"));
        System.out.println("index of two: " + arrayList.indexOf("two"));

        arrayList.clear();

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("is empty?: " + arrayList.isEmpty());


        System.out.println("-------------------- Map --------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "second");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            int key = m.getKey();
            String value = m.getValue();

            System.out.println(key + ":" + value);
        }

        System.out.println("map contains 'first'?: " + map.containsValue("first"));
        System.out.println("map contains key 5?: " + map.containsKey(5));
        System.out.println("value on index 2: " + map.get(2));
        System.out.println("values: " + map.values());

        map.clear();

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            int key = m.getKey();
            String value = m.getValue();

            System.out.println(key + ":" + value);
        }


        System.out.println("values: " + map.values());
        System.out.println("map size: " + map.size());


        System.out.println("-------------------- Set --------------------");

        Set<String> set = new HashSet<>();
        set.add("1st");
        set.add("2nd");
        set.add("3rd");

        set.add("1st");
        set.add("4th");
        set.add("3rd");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------- Set Lotto -----------------");

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() <= 6) {
            int drawNumber = random.nextInt(36) + 1;
            System.out.println("draw number" + drawNumber);
            numbers.add(drawNumber);
        }

        System.out.println("draw numbers are:");
        for (Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println("contains 3?: " + numbers.contains(3));
        System.out.println("contains 31?: " + numbers.contains(31));

        List<Integer> intList = new ArrayList<>();
        intList.addAll(numbers);

        System.out.println("convert Set collection to ArrayList collection:");

        for (Integer i : intList) {
            System.out.println(i);
        }
    }
}
