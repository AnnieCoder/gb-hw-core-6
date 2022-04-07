package ru.gb.java_core.zoo;

public class Animal {

    protected String name;
    protected String color;
    private static int count;

    public Animal() {
        count++;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run(int length) {
        System.out.println("");
    }

    public void swim() {
        System.out.println("");
    }

    public void swim(int length) {
        System.out.println("");
    }

    public int getCount() {
        return count;
    }
}
