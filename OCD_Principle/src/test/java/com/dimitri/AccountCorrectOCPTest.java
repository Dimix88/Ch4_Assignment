package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountCorrectOCPTest {

    AccountCorrectOCP test = new AccountCorrectOCP(100,200,400);

    @Test
    public void add() {
        double result = test.add();
        Assert.assertEquals(700, result, 0.00);

    }
}