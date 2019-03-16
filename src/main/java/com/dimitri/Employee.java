package com.dimitri;

public class Employee {

    private String name;            //encapsulation hiding variables by making them private
    private String surname;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String printDetails(){               //Abstraction hiding the workings of the method from the user
        String details = "The employee name is "+getName()+" "+getSurname();
        return details;
    }
}
