package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddCalculatorTest {

    CalculatorViolateSRP test = new CalculatorViolateSRP();

    @Test
    public void add() {

        double result = test.add(10, 16);
        Assert.assertEquals(26, result,0.00);
    }
}