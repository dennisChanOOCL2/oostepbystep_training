package com.oocl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {

    @Test
    public void testIntroduce() {
        Student student = new Student();
        student.setAge(18);
        Klass cls = new Klass();
        cls.setName("2");
        student.setCls(cls);
        student.setName("Tom");
        assertEquals("My name is Tom. I am 18 years old. " +
                        "I am a student of class 2. " +
                        "Coding for the glory of OOCL."
                ,student.introduce());
    }
//My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Klass 2.
    @Test
    public void testWelcomeOtherStu(){

        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        Student student_Tom = new Student();
        student_Tom.setName("Tom");
        student_Tom.setAge(18);
        Student student_Jim = new Student();
        student_Jim.setName("Jim");

        Klass cls = new Klass();
        cls.setName("2");
        cls.setTeacher(teacher);
        cls.addStudentToClass(student_Tom);
        cls.addStudentToClass(student_Jim);

        assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Klass 2."
                ,student_Tom.getWelcomeMessages().get(cls.getName()+student_Jim.getName()));
    }

    @Test
    public void testOtherStuBecomeLeader(){

        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        Student student_Tom = new Student();
        student_Tom.setName("Tom");
        student_Tom.setAge(18);

        Student student_Jim = new Student();
        student_Jim.setName("Jim");

        Klass cls = new Klass();
        cls.setName("2");
        cls.setTeacher(teacher);
        cls.addStudentToClass(student_Tom);
        cls.addStudentToClass(student_Jim);
        cls.assignLeaderToClass(student_Jim);

        assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2."
                ,student_Tom.getStuLeaderMessages().get(cls.getName()+cls.getStudentLeader().getName()));
    }


}