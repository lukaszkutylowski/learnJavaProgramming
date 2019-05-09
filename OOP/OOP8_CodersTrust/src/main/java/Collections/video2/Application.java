package Collections.video2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ArrayList numbersAL = new ArrayList();
        numbersAL.add("text");
        numbersAL.add(123);
        numbersAL.add(11.11);

        System.out.println(numbersAL);

        ArrayList<Integer> integersAL = new ArrayList<>();
        integersAL.ensureCapacity(1000);
        integersAL.add(11);
        integersAL.add(12);
        integersAL.add(13);

        System.out.println(integersAL);

        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(11);
        numbersSet.add(12);
        numbersSet.add(13);
        numbersSet.add(14);

        for(Integer i: numbersSet) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("Imię", "Leszek");
        map.put("Wiek", "21");

        for (String key: map.keySet()) {
            System.out.println("klucz: " + key + ", value " + map.get(key));
        }

        System.out.println(map.get("Imię"));

        JFrame frame = new JFrame("My Window");
        frame.setVisible(true);
        frame.add(new TextField());
        frame.setVisible(true);
    }
}
