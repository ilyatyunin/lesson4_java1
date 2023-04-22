package ru.betboom;

public class Human {
    private String name;
    private int age;
    private String[] hobbies;

    public Human(String name, String age, String[] hobbies) {
        this.name = name;
        this.age = Integer.parseInt(age);
        this.hobbies = hobbies;
    }
}
