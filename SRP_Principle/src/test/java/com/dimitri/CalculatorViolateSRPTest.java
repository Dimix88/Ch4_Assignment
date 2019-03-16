package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorViolateSRPTest {
    CalculatorViolateSRP test = new CalculatorViolateSRP();
    @Test
    public void add() {
        double result = test.add(10, 16);
        Assert.assertEquals(26, result,0.00);
    }

    @Test
    public void minus() {
        double result = test.minus(15, 5);
        Assert.assertEquals(10, result, 0.00);
    }
}