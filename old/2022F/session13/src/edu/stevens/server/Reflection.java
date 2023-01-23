package edu.stevens.server;

import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception {
        Object obj = Class.forName("edu.stevens.server.Person");
        Class c = obj.getClass(); // gets the metadata for your object
        System.out.println(c.getPackage());

        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
