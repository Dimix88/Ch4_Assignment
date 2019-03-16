package com.dimitri;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MinusCalculatorTest {
    CalculateInt calc2;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanMinus.class);
        calc2=(CalculateInt)ctx.getBean("minusBean");
    }
    @Test
    public void calculate() {
        double result = calc2.calculate(10, 5);
        Assert.assertEquals(5, result, 0.00);
    }


}