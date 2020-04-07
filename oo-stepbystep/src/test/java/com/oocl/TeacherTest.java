package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void testIntroduce() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        assertEquals("My name is Woody. " +
                "I am 30 years old. Teaching for the future of world."
                ,teacher.introduce());
    }
    // My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Klass 2.

    @Test
    public void testAddStudToClass() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        Student student = new Student();
        student.setName("Tom");
        Klass cls = new Klass();
        cls.setName("2");
        cls.setTeacher(teacher);
        cls.addStudentToClass(student);
        assertEquals("My name is Woody. " +
                        "I am 30 years old. " +
                        "Teaching for the future of world." +
                        " Welcome Tom join Klass 2."
                ,teacher.getWelcomeMessage().get(cls.getName()+student.getName()));
    }

    @Test
    public void testAssignStuLeaderToClass() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        Student student = new Student();
        student.setName("Tom");
        Klass cls = new Klass();
        cls.setName("2");
        cls.setTeacher(teacher);
        cls.addStudentToClass(student);

        cls.assignLeaderToClass(student);

        assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Klass 2."
                ,teacher.getIntrodStuLeaderMsg().get(cls.getName()+student.getName()));
    }
}
