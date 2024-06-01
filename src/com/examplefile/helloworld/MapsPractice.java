package com.examplefile.helloworld;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    // Map uses key/value pairs inside a HashMap, for example.
    // Methods include V get(Object key), V getOrDefault(Object key, V other), V put(K key, V value), V remove(Object key),
    // boolean containsValue(Object value), set<K> keySet() and Collection<V> values()

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();  // Map<> takes the parameter of the datatype of the key as well as the value.
        map.put("chicken", "corn");  // put() adds the key/value to the HashMap.
        map.put("cow", "wheat");
        String feed = map.get("chicken"); // get() provides the value based on the input key parameter.
//        System.out.println(feed);

        String other = map.getOrDefault("butterfly", "leaf"); // We provide the key of butterfly to search for, if not found we also provided the default return value of "leaf".
//        System.out.println(other);

        String update = map.remove("cow");
//        System.out.println(update);

        if (map.containsKey("chicken")) {
//            System.out.println("Map contains the key chicken");
        } else {
//            System.out.println("Map does not contain the key chicken");
        }

        if (map.containsValue("soap")) {
//            System.out.println("Map contains value");
        } else {
//            System.out.println("Map does not contain value");
        }

        // We can loop over the HashMap and print values we need from it.
        for (String key : map.keySet()) {
//            System.out.println(key + ":" + map.get(key)); // We tell it to print the key but then we call get with the key value in order to print the value.
        }

        // Math API functions.
        int first = Math.max(2,9);
        int second = Math.min(8,-2);
//        System.out.println("Max is: " + first + " and Min is: " + second);

        long rounding = Math.round(126.32);
//        System.out.println(rounding);
        long rounding2 = Math.round(126.52);
//        System.out.println(rounding2);

        // Math.pow only returns a double so it can only be in the datatype of a double, not int or any other type. See second sample.
        double exponent = Math.pow(5, 2);
//        System.out.println(exponent);

        int exponentInt = (int) Math.pow(5, 2);
//        System.out.println(exponentInt);

        // Prints a random number between 0 and 1. In order to see this number, must be in a double.
        double randomNum = Math.random();
        System.out.println(randomNum);
    }
}
