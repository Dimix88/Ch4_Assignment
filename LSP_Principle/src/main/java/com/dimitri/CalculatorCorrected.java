package com.dimitri;

public class CalculatorCorrected {

    private Calculator calc = new Calculator();

    public double add(double x, double y, double p){
        return calc.add(x, y) + p;

    }
}
