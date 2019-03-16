package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator2Test {

    //The test fails because the Calculator class has its own add method and Calculator2 made changes to this method whidh
    //violates the LSP principle and it fails the test

    Calculator2 test = new Calculator2();

    @Test
    public void add() {
        double result = test.add(4,5,10);
        Assert.assertEquals(19, result, 0.00);
    }
}