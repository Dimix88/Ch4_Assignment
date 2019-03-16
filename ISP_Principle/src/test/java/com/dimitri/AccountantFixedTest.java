package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountantFixedTest {
    Accountant test = new Accountant(100, 300);
    @Test
    public void add() {
        double result = test.add();
        Assert.assertEquals(400, result, 0.00);
    }
}