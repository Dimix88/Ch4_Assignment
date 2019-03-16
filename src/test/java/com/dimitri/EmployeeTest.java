package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee emp = new Employee("Jack", "Clark");

    @Test
    public void printDetails() {

        String result = emp.printDetails();
        Assert.assertEquals("The employee name is Jack Clark",result);
    }
}