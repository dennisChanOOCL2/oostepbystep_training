package com.oocl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private Klass cls;
    private Map<String, String> welcomeMessages = new HashMap<String, String>();
    private Map<String, String> stuLeaderMessages = new HashMap<String, String>();

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
        String welcomeMsg = this.introduce() + String.format(" Welcome %s join Klass %s.", stu.getName(), this.cls.getName());
        String key = this.getCls().getName()+stu.getName();
        if(welcomeMessages.get(key) == null){
            welcomeMessages.put(key, welcomeMsg);
        }
    }

    public void stuLeaderIntrod() {
        String stuLeaderMsg = this.introduce() + String.format(" %s is the leader of Class %s.",
                this.getCls()
                        .getStudentLeader()
                        .getName(),
                this.getCls().getName());
        String key = this.getCls().getName()+this.getCls().getStudentLeader().getName();
        if(stuLeaderMessages.get(key) == null){
            stuLeaderMessages.put(key, stuLeaderMsg);
        }

    }

    public Map<String, String> getWelcomeMessages() {
        return welcomeMessages;
    }


    public Map<String, String> getStuLeaderMessages() {
        return stuLeaderMessages;
    }

}
