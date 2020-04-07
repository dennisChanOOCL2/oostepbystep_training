package com.oocl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {

    @Test
    public void testPrintMessage() {
        Person person = new Person();
        person.setAge(21);
        person.setName("Tom");
        assertEquals("There is a person who has name and age." +
                " He can introduce himself, like:" +
                " My name is Tom. I am 21 years old."
                ,person.introduce());
    }
}
