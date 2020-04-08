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

    public Map<String, String> getIntrodStuLeaderMsg() {
        return introdStuLeaderMsg;
    }


    public List<Klass> getClsList() {
        return clsList;
    }


    @Override
    public String introduce(){
        return String.format(super.introduce() +
                "Teaching for the future of world.");
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
