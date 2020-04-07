package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private String name;
    private List<Student> studentList = new ArrayList<Student>();
    private Student studentLeader;
    private Teacher teacher;

    public String addStudentToClass(Student stu){
        String resultStr = "";
        if(!studentList.contains(stu)){
            if(this.getTeacher() != null){
                resultStr += this.getTeacher().welcomeStu(stu, this);
            }
            for(Student inClassStu : studentList){
                resultStr += inClassStu.welcomeOtherStu(stu);
            }
            studentList.add(stu);
            stu.setCls(this);
        }
        return "";
    }

    public String assignLeaderToClass(Student stu){
        this.setStudentLeader(stu);
        if(this.getStudentLeader() != null){
            if(this.getTeacher() != null){
                return this.getTeacher().introduceStuLeader(stu, this);
            }
            return "";
        }else{
            return "";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student getStudentLeader() {
        return studentLeader;
    }

    public void setStudentLeader(Student studentLeader) {
        if(studentList.contains(studentLeader)){
            this.studentLeader = studentLeader;
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        if(!teacher.getClsList().contains(this)
                && teacher.getClsList().size() < 5){
            this.teacher = teacher;
            teacher.getClsList().add(this);
        }
    }
}