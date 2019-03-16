package com.dimitri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanMinus {

    @Bean(name = "minusBean")

    public CalculateInt getService(){
        return new MinusCalculator();
    }
}
