package com.dimitri;

public class CalculatorViolateSRP {
    //The class violates the Single Repository Principle because it does more than one thing

    public double add(double x, double y){

        return x+y;
    }
    public double minus(double x, double y){

        return x-y;
    }

    // to conform to SRP I have created two classes which implements the two methods
}
