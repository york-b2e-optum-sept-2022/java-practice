package net.yorksolutions.demo;

public class Greeter {
    String name;

    public Greeter(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, " + this.name;
    }
}
