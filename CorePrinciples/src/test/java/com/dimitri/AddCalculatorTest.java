package com.dimitri;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class AddCalculatorTest {

    CalculateInt calc1;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        calc1=(CalculateInt)ctx.getBean("calcBean");

    }


    @Test
    public void calculate() {
        double result = calc1.calculate(10, 5);
        Assert.assertEquals(15, result, 0.00);
    }


}