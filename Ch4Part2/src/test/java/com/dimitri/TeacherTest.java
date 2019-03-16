package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    Employee emp = new Teacher("James", "Marks", 113, "Strandfontein High");

    @Test
    public void printDetails() {
        String result = emp.printDetails();
        Assert.assertEquals("The employee name is James Marks\n The teachers ID is: 113\n He works at Strandfontein High",result );
    }
}