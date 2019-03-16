package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountantTest {
Accountant test = new Accountant(100, 300);
    @Test
    public void add() {
        double result = test.add();
        Assert.assertEquals(400, result, 0.00);
    }

    @Test
    public void writeBook() {
        String result = test.writeBook();
        Assert.assertEquals("I want to write a Book", result);
    }
}