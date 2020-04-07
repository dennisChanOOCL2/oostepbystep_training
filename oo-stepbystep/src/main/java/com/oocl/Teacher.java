package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<Klass> clsList = new ArrayList<Klass>();

    public List<Klass> getClsList() {
        return clsList;
    }

    public void setClsList(List<Klass> clsList) {
        if(clsList.size() < 5){
            this.clsList = clsList;
        }else{
            return;
        }
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. " +
                "I am %s years old. " +
                "Teaching for the future of world.", this.getName(), this.getAge());
    };

    public String welcomeStu(Student stu, Klass cls){
        return this.introduce() +  String.format(" Welcome %s join Klass %s.", stu.getName(), cls.getName());
    }

    public String introduceStuLeader(Student stu, Klass cls){
        return this.introduce() +  String.format(" %s is the leader of Klass %s.", stu.getName(), cls.getName());
    }
}
