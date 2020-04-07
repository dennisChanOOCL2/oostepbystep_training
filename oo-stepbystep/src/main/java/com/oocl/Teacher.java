package com.oocl;

import java.util.List;

public class Teacher extends Person {

    private List<Class> clsList;

    public List<Class> getClsList() {
        return clsList;
    }

    public void setClsList(List<Class> clsList) {
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
}
