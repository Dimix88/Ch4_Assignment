package com.dimitri;

public class Teacher extends Employee {         // Inheritance

    private int teacheNr;
    private String school;

    public Teacher(String name, String surname, int teacheNr, String school) {
        super(name, surname);
        this.teacheNr = teacheNr;
        this.school = school;
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

    public String printDetails(){
        String details = "The employee name is "+getName()+" "+getSurname()+"\n The teachers ID is: "+getTeacheNr()+"\n He works at "+getSchool();
        return details;
    }
}
