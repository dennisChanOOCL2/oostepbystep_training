package com.oocl;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return String.format("There is a person who has name and age. He can introduce himself, like: My name is %s. I am %s years old.", this.getName(), this.getAge());
    };
}
