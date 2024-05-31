package com.examplefile.helloworld;

import java.util.*;

public class ArrayListPractice {
    // ArrayList methods: add(), remove(), set(), isEmpty(), size(), clear(), contains(), equals()

    // We did not specify the type for the ArrayList so it defaults to Object. (includes everything except primitives)
    public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add("Chocolate Cake");
      list.add("Cinnamon Rolls");
//        System.out.println(list);

      // Here we specify String.
      ArrayList<String> better = new ArrayList<>();
        better.add("cucumber");
        better.add("hummus");
        better.add("chicken");
        better.add(1,"Truvia");

//        System.out.printf(String.valueOf(better));

        // Check to see if the ArrayList contains an element.
//        System.out.println(better.contains("hummus"));
//        System.out.println(better.contains("blueberries"));

        // remove() will print false if the element does not exist.
        better.remove("chicken");
//        System.out.printf(String.valueOf(better));

        better.remove(1);
//        System.out.println(String.valueOf(better));

        // Set changes an element in an ArrayList without changing the size if it.
        better.set(0, "pomegranate");
//        System.out.println(String.valueOf(better));

        // Check to see if the ArrayList is empty and how many elements are stored inside it.
//        System.out.println(better.isEmpty());
//        System.out.println(better.size());

        // Clear the ArrayList.
        better.clear();
//        System.out.println(better.isEmpty());
//        System.out.println(better.size());

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
//        System.out.println(one.equals(two));

        one.add("a");
//        System.out.println(one.equals(two));


    }
}
