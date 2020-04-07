package com.oocl;

import java.util.List;

public class Class {

    private String name;
    private List<Student> studentList;
    private Student studentLeader;
    private Teacher teacher;

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
        this.studentLeader = studentLeader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
