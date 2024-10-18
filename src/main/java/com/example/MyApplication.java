package com.example;

/**
 * A simple Java class that demonstrates a basic functionality.
 */
public class MyApplication {

    /**
     * Prints a welcome message.
     *
     * @param name the name to greet
     * @return a welcome message string
     */
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        System.out.println(app.getGreeting("World"));
    }
}
