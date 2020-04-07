package com.oocl;

import java.util.ArrayList;

public class Student extends Person {

    private Klass cls;
    private ArrayList<String> welcomeMessages;
    private ArrayList<String> stuLeaderMessages;

    @Override
    public Klass getCls() {
        return cls;
    }

    @Override
    public void setCls(Klass cls) {
        this.cls = cls;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. " +
                "I am %s years old. " +
                "I am a student of class %s. " +
                "Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getCls().getName());
    }

    ;

    public void welcomeOtherStu(Student stu) {
        welcomeMessages.add(this.introduce() + String.format(" Welcome %s join Klass %s.", stu.getName(), this.cls.getName()));
    }

    public void stuLeaderIntrod() {
        stuLeaderMessages.add(this.introduce() + String.format(" %s is the leader of Class %s.",
                this.getCls()
                        .getStudentLeader()
                        .getName(),
                this.getCls().getName()));
    }

    public void joinClass(Klass cls) {
        cls.addStudentToClass(this);
    }

    public ArrayList<String> getWelcomeMessages() {
        return welcomeMessages;
    }

    public void setWelcomeMessages(ArrayList<String> welcomeMessages) {
        this.welcomeMessages = welcomeMessages;
    }

    public ArrayList<String> getStuLeaderMessages() {
        return stuLeaderMessages;
    }

    public void setStuLeaderMessages(ArrayList<String> stuLeaderMessages) {
        this.stuLeaderMessages = stuLeaderMessages;
    }
}
