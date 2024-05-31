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

        // Autoboxing and unboxing. (converting a primitive to its relevant wrapper class and vice versa.)
        List<Integer> weights = new ArrayList<>();
        Integer w = 50; // Unboxes the int primitive into an Integer object.
        weights.add(w);
        weights.add(Integer.valueOf(60)); // Autobox the int to wrapper Integer.

//      System.out.println(weights);

        // Turn ArrayList into an array. Cannot change values in the new array.
        List<String> list2 = new ArrayList<>();
        list2.add("hawk");
        list2.add("eagle");
        list2.add("owl");
        String[] newArray = list2.toArray(new String[0]);
//      System.out.println(Arrays.toString(newArray));

      // We can use "instanceof" to confirm type once the conversion is complete.
      if(newArray instanceof String[]) {
//        System.out.println("ArrayList was converted to array.");
      } else {
//        System.out.println("ArrayList was not converted to an array.");
      }

      // Converting an array to a list (NOT ArrayList) using .asList() allows elements to be updated in both the list and the array.
      // Cannot remove elements from list.
      String[] birdArray = {"robin", "finch", "magpie"};
      List<String> birdList = Arrays.asList(birdArray);
//      System.out.println(birdList.size());  // Prints 3.

      birdList.set(0, "test");
      birdArray[1] = "test2";
//      System.out.println(Arrays.toString(birdArray));

      // Convert an array to a list using .of() creates an immutable list.
      String[] newBirdArray = {"toucan", "macaw", "amazon"};
      List<String> newBirdList = List.of(newBirdArray);
//      System.out.println(newBirdList.size());

      newBirdArray[0] = "test";
//      System.out.println(Arrays.toString(newBirdArray));
//      System.out.println(newBirdList);

      // Sorting an ArrayList.
      List<Integer> numbersList = new ArrayList<>();
      numbersList.add(32);
      numbersList.add(15);
      numbersList.add(24);
      Collections.sort(numbersList);
      System.out.println(numbersList);
    }
}
