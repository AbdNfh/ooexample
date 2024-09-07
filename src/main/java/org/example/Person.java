package org.example;

public class Person {
    private String name;
    private int age;
    private Person friend;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 20;
    }

    public void sayName() {
        System.out.println("My Name is " + name);
    }

    public void increaseAgeBy(int years) {
        age = age + years;
    }

    public int getAge() {
        return age;
    }
}
