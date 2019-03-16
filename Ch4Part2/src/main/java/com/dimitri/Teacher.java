package com.dimitri;

public class Teacher implements Employee {
    private String name;
    private String surname;
    private int teacheNr;
    private String school;

    public Teacher(String name, String surname, int teacheNr, String school) {
        this.name = name;
        this.surname = surname;
        this.teacheNr = teacheNr;
        this.school = school;
    }

    @Override
    public String printDetails() {
        String details = "The employee name is "+getName()+" "+getSurname()+"\n The teachers ID is: "+getTeacheNr()+"\n He works at "+getSchool();
        return details;
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

    public int getTeacheNr() {
        return teacheNr;
    }

    public void setTeacheNr(int teacheNr) {
        this.teacheNr = teacheNr;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
