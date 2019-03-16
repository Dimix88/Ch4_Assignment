package com.dimitri;

public class Calculator {

    public double add(double x, double y){

        return x+y;
    }
    //the class has one method but in order to add more features the class needed to be revised which violates the
    //Open/Closed principle

    //Ive created a Interface that has a method that can be tailored to the needs of the class which makes sure no that
    //no class needs to be modified in order to add features

}
