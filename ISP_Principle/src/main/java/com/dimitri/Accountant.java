package com.dimitri;

public class Accountant implements CalculatorInt{
    double total1;
    double total2;

    public Accountant(double total1, double total2) {
        this.total1 = total1;
        this.total2 = total2;
    }

    @Override
    public double add() {
        return total1 + total2;
    }
    //the Accountant class does not need this method but it is defined in the interface so it needs to overide it
    @Override
    public String writeBook() {
        String message = "I want to write a Book";
        return message;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double total2) {
        this.total2 = total2;
    }
}
