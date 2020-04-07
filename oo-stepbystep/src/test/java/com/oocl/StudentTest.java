package com.oocl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {

    @Test
    public void testPrintMessage() {
        Student student = new Student();
        student.setAge(18);
        student.setName("Tom");
        assertEquals("There is a student who will introduce himself like this:" +
                " My name is Tom. I am 18 years old." +
                " Coding for the glory of OOCL."
                ,student.introduce());
    }
}