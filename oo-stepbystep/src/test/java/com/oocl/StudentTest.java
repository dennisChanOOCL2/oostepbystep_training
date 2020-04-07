package com.oocl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {

    @Test
    public void testIntroduce() {
        Student student = new Student();
        student.setAge(18);
        Class cls = new Class();
        cls.setName("2");
        student.setCls(cls);
        student.setName("Tom");
        assertEquals("My name is Tom. I am 18 years old. " +
                        "I am a student of class 2. " +
                        "Coding for the glory of OOCL."
                ,student.introduce());
    }
}