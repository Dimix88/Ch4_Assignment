package com.dimitri;

public class Implementer {

    public static void main(String [] args){
        //Polymorphism casting the super to create one of its child classes
        Employee james = new Teacher("James", "Marks", 113, "Strandfontein High");
        System.out.println(james.printDetails());

    }
}
