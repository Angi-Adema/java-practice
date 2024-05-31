package com.examplefile.helloworld;

import java.util.*;

public class SetsPractice {
    // A set is an object that cannot contain duplicates. Sets are not ordered and do not function with indices.
    // Can use all the same methods as that in ArrayList EXCEPT those requiring an index in their parameter.
    // add(), remove(), set(), isEmpty(), size(), clear(), contains(), equals()

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(45);
        numbers.add(18);
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.remove(18);
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
