package com.dimitri;

public class DipCalculator {

    public double add(double x, double y){

        return x+y;
    }
    public double minus(double x, double y){

        return x-y;
    }

    //this violates DIP because if i want to add a feature I must make changes to the calculator class
}
