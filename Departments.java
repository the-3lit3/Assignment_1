package com.sanjaeJava.company;

public class Departments {
    private String dptName;
    //private Office officeX;

    public Departments(String dptName) {
        this.dptName = dptName;
        //this.officeX = newOfficeX;

    }

    public void setDptName(String dName){
        this.dptName = dName;
    }
    public String getDptName(){

        return this.dptName;
    }

//    public Office getOfficeX() {
//        return officeX;
//    }
}
