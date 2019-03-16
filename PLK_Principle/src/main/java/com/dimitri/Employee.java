package com.dimitri;

public class Employee {
    String name;
    Email email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee name:" +getName()+"\nemail address: "+getEmail();
    }
}
