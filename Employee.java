package com.sanjaeJava.company;

public class Employee {
    private String Name;
    private Departments department; //Aggregation relationship

    public Employee(String newName, Departments dept){
        this.Name = newName;
        this.department = dept;
    }
    public Departments getDepartment(){

       return department;
    }

    public String toString() {
        return Name;
    }
}
