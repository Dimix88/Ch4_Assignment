package com.dimitri;

public class CheckEmployee {

    public static void main(String [] args){
        Employee emp = new Employee();
        emp.setName("Miles");

        Email email = new Email();
        email.setEmailAddress("mile@gmail.com");
        emp.setEmail(email);

        // the coupling of the classes violate the Principle of Least Knowledge

        System.out.println(emp.getEmail().getEmailAddress());
    }

}
