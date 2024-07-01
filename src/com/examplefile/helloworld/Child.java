package com.examplefile.helloworld;


public class Child extends Person {
    static String name;
    void setName(String w) {
        name = w;
    }
    public static void main(String[] p) {
        final Child m = new Child();
        final Person t = m;
        m.name = "Elysia";
        System.out.println(m.name );
        t.name = "Sophia";
        m.setName("Webby");
        System.out.println("m name: " + m.name + " " + "t name: " +  t.name);
        t.setName("Olivia");
        System.out.println("m name: " + m.name + " " + "t name: " +  t.name);
    }
}