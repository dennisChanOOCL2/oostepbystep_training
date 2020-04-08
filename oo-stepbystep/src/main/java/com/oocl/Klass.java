package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private String name;
    private List<Student> studentList = new ArrayList<Student>();
    private Student studentLeader;
    private Teacher teacher;

    public void addStudentToClass(Student stu){
        if(!studentList.contains(stu)){
            if(this.getTeacher() != null){
               this.getTeacher().welcomeStu(stu, this);
            }
            for(Student inClassStu : studentList){
                inClassStu.welcomeOtherStu(stu);
            }
            studentList.add(stu);
            stu.setCls(this);
        }
    }

    public void assignLeaderToClass(Student stu){
        this.setStudentLeader(stu);
        if(this.getStudentLeader() != null){
            if(this.getTeacher() != null){
                this.getTeacher().introduceStuLeader(stu, this);
            }
            for(Student inClassStu : this.getStudentList()){
                if(inClassStu != this.getStudentLeader()){
                    inClassStu.stuLeaderIntrod();
                }
            }
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
