package com.dimitri;

public interface CalculatorInt {
//the interface has 2 methods but some classes may not need both, it violates Interface Segregaion Principle
    //to adhere to ISP the interface must be devided into to interfaces
    public double add();

    public String writeBook();
}
