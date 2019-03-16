package com.dimitri;

public class AccountCorrectOCP implements CalculatorInt {
    double total1;
    double total2;
    double total3;

    public AccountCorrectOCP(double total1, double total2, double total3) {
        this.total1 = total1;
        this.total2 = total2;
        this.total3 = total3;
    }

    @Override
    public double add() {

        return total1 + total2 + total3;
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

    public double getTotal3() {
        return total3;
    }

    public void setTotal3(double total3) {
        this.total3 = total3;
    }
}
