package com.oocl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {

    @Test
    public void testPrintMessage() {
        Person person = new Person();
        person.setAge(21);
        person.setName("Tom");
        assertEquals("My name is Tom. I am 21 years old. "
                ,person.introduce());
    }
}
