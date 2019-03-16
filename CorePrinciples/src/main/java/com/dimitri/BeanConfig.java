package com.dimitri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "calcBean")

    public CalculateInt getService(){
        return new AddCalculator();
    }


}
