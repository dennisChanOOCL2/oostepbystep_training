package com.oocl;

public class Person {
    private String name;
    private int age;
    private Klass cls;

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

    public Klass getCls() {
        return cls;
    }

    public void setCls(Klass cls) {
        this.cls = cls;
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old. ", this.getName(), this.getAge());
    };
}
