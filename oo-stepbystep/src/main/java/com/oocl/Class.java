package com.oocl;

import java.util.List;

public class Class {

    private String name;
    private List<Student> studentList;
    private Student studentLeader;
    private Teacher teacher;

    public void addStudentToClass(Student stu){
        if(!studentList.contains(stu)){
            studentList.add(stu);
            stu.setCls(this);
            if(this.getTeacher() != null){

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
