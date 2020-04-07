package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void testIntroduce() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        assertEquals("There is a teacher who will " +
                "introduce himself like this: My name is Woody. " +
                "I am 30 years old. Teaching for the future of world."
                ,teacher.introduce());
    }
    // My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.

    @Test
    public void testAddStudToClass() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        Student student = new Student();
        student.setName("Tom");
        Class cls = new Class();
        cls.setName("2");
        cls.setTeacher(teacher);
        assertEquals("My name is Woody. " +
                        "I am 30 years old. " +
                        "Teaching for the future of world." +
                        " Welcome Tom join Class 2."
                ,cls.addStudentToClass(student));
    }
}
