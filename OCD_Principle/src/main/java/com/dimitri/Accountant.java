package com.dimitri;

public class Accountant {
    // the Account class makes use of the add method, but if we want more features like adding more then one number
    // the class must either be modified which violates OCP or changed in some other way
    public static void main(String[] args) {

    Calculator calc = new Calculator();
    calc.add(100,500);

}
}
