package ru.gb.java_core.zoo;

public class Dog extends Animal {

    protected final int RUN_LIMIT = 500;
    protected final int SWIM_LIMIT = 10;
    private static int count;

    public Dog(String name, String color) {
        super(name, color);
        count++;
    }

    @Override
    public void run(int length) {
        if (length > RUN_LIMIT) {
            System.out.printf("Собаки не бегают больше %d м\n", RUN_LIMIT);
        } else {
            System.out.printf("%s пробежал %d м\n", name, length);
        }
    }

    @Override
    public void swim(int length) {
        if (length > SWIM_LIMIT) {
            System.out.printf("Собаки не плавают больше %d м\n", RUN_LIMIT);
        } else {
            System.out.printf("%s проплыл %d м\n", name, length);
        }
    }

    public int getCount() {
        return count;
    }

}
