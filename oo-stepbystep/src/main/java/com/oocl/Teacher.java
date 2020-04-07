package com.oocl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher extends Person {

    private List<Klass> clsList = new ArrayList<Klass>();
    private Map<String, String> welcomeMessage = new HashMap<String, String>();
    private Map<String, String> introdStuLeaderMsg= new HashMap<String, String>();

    public Map<String, String> getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(Map<String, String> welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public Map<String, String> getIntrodStuLeaderMsg() {
        return introdStuLeaderMsg;
    }

    public void setIntrodStuLeaderMsg(Map<String, String> introdStuLeaderMsg) {
        this.introdStuLeaderMsg = introdStuLeaderMsg;
    }

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

    public void welcomeStu(Student stu, Klass cls){
        String welcomeMsg = this.introduce() +  String.format(" Welcome %s join Klass %s.", stu.getName(), cls.getName());
        if(welcomeMessage.get(cls.getName()+stu.getName()) == null){
            welcomeMessage.put(cls.getName()+stu.getName(), welcomeMsg);
        }
    }


    public void introduceStuLeader(Student stu, Klass cls){
        String introdMsg = this.introduce() +  String.format(" %s is the leader of Klass %s.", stu.getName(), cls.getName());
        if(introdStuLeaderMsg.get(cls.getName()+stu.getName()) == null){
            introdStuLeaderMsg.put(cls.getName()+stu.getName(), introdMsg);
        }
    }
}
