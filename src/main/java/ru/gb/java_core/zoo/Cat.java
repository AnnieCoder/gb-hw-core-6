package ru.gb.java_core.zoo;

public class Cat extends Animal {

    protected final int RUN_LIMIT = 200;
    private static int count;

    public Cat(String name, String color) {
        super(name, color);
        count++;
    }

    @Override
    public void run(int length) {
        if (length > RUN_LIMIT) {
            System.out.printf("Коты не бегают больше %d м\n", RUN_LIMIT);
        } else {
            System.out.printf("%s пробежал %d м\n", name, length);
        }
    }

    @Override
    public void swim() {
        System.out.println("Коты не плавают");
    }

    public int getCount() {
        return count;
    }

}
