package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorCorrectedTest {
        CalculatorCorrected test = new CalculatorCorrected();
    @Test
    public void add() {
        double result = test.add(4,5,10);
        Assert.assertEquals(19, result, 0.00);
    }
}