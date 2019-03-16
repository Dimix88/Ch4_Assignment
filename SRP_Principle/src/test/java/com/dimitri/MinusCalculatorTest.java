package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinusCalculatorTest {

    CalculatorViolateSRP test = new CalculatorViolateSRP();

    @Test
    public void minus() {

        double result = test.minus(15, 5);
        Assert.assertEquals(10, result, 0.00);
    }
}