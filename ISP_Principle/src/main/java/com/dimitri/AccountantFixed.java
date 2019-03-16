package com.dimitri;

public class AccountantFixed implements Calculator{
    //now the class only implements methods the it needs
    double total1;
    double total2;

    public AccountantFixed(double total1, double total2) {
        this.total1 = total1;
        this.total2 = total2;
    }

    @Override
    public double add() {
        return total1 + total2;
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
