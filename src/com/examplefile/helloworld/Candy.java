package com.examplefile.helloworld;

import java.util.*;
import java.util.function.*;

// Practice with lambdas and built in interfaces such as Predicate, Consumer and Supplier.
public class Candy {
    private String candyName;
    private boolean isChocolate;
    private boolean isChewy;

    public Candy(String nameOfCandy, boolean chocolate, boolean chewy) {
        candyName = nameOfCandy;
        isChocolate = chocolate;
        isChewy = chewy;
    }
    public boolean isChocolate() { return isChocolate; }
    public boolean isChewy() { return isChewy; }
    public String getCandyName() { return candyName; }

    @Override
    public String toString() {
        return candyName;
    }

    public static void main(String[] args) {
        List<Candy> candies = new ArrayList<Candy>();
        candies.add(new Candy("Toblerone", true, false));
        candies.add(new Candy("Laffy Taffy", false, true));
        candies.add(new Candy("Jolly Rancher", false, false));
        candies.add(new Candy("M & M", true, false));

        // Lambda and Predicate
        Predicate<Candy> chocolatePredicate = c -> c.isChocolate();

        // Lambda and Consumer
        Consumer<Candy> printConsumer = c -> System.out.println(c.getCandyName());

        // Lambda and Supplier to create new Candy instances.
        Supplier<Candy> cherrySliceSupplier = () -> new Candy("Cherry Slice", false, true);
        Supplier<Candy> turtleSupplier = () -> new Candy("Turtle", true, true);

        // Add new candies using Supplier.
        candies.add(cherrySliceSupplier.get());
        candies.add(turtleSupplier.get());

        // Lambda and Comparator to sort candy names.
        Comparator<Candy> nameComparator = Comparator.comparing(c -> c.getCandyName());
        candies.sort(nameComparator);
        System.out.println("Sorted by name: ");
        print(candies, c -> true, printConsumer);

        print(candies, chocolatePredicate, printConsumer);
    }
    // Pass in Predicate.
    private static void print(List<Candy> candies, Predicate<Candy> checker, Consumer<Candy> action) {
        for (Candy candy : candies) {
            // Predicate interface utilized here.
            if (checker.test(candy))
                action.accept(candy);
        }
        System.out.println();
    }
}
