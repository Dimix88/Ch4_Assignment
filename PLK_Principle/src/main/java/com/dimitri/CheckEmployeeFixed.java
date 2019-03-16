package com.dimitri;

public class CheckEmployeeFixed {

    public static void main(String [] args){
        Employee emp = new Employee();
        emp.setName("Miles");

        Email email = new Email();
        email.setEmailAddress("mile@gmail.com");
        emp.setEmail(email);

        // This is a better way of printing the email address and it adhere to the Law of Demeter
        System.out.println(email.getEmailAddress());
    }
}
