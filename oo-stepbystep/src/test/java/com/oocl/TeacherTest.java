package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void testPrintMessage() {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");
        assertEquals("There is a teacher who will " +
                "introduce himself like this: My name is Woody. " +
                "I am 30 years old. Teaching for the future of world."
                ,teacher.introduce());
    }
}
