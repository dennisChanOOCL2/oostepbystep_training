package com.oocl;

public class Student extends Person {

    private Class cls;

    @Override
    public Class getCls() {
        return cls;
    }

    @Override
    public void setCls(Class cls) {
        this.cls = cls;
    }

    @Override
    public String introduce(){
        return String.format("There is a student who will introduce himself like this: " +
                "My name is %s. I am %s years old. " +
                "I am a student of class %s." +
                "Coding for the glory of OOCL.", this.getName(), this.getCls(), this.getAge());
    };
}
