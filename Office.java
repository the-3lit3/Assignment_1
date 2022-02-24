package com.sanjaeJava.company;

public class Office{
    private String officeAddress;
    private Departments department; //Aggregation

    public Office(String officeAddress, Departments nDept) {
        this.officeAddress = officeAddress;
        this.department = nDept;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public String toString() {
        return officeAddress;
    }
}
