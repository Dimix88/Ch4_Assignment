package com.dimitri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FixedCalculator {
    public static void main(String[] args) {

        CalculateInt calc1;
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        calc1=(CalculateInt)ctx.getBean("calcBean");
        System.out.println("Adding the numbers "+calc1.calculate(4, 9));

        CalculateInt calc2;
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanMinus.class);
        calc2=(CalculateInt)ctx2.getBean("minusBean");
        System.out.println("Subtracting the numbers "+calc2.calculate(100, 9));
    }
}
