package ru.gb.java_core;

import ru.gb.java_core.zoo.Animal;
import ru.gb.java_core.zoo.Cat;
import ru.gb.java_core.zoo.Dog;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Kitty", "grey"),
                new Dog("Bobby", "red"),
                new Cat("Barsik", "white")
        };

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                animal.run(100);
                animal.swim();
            } else if (animal instanceof Dog) {
                animal.run(600);
                animal.swim(6);
            }
        }

    }
}
