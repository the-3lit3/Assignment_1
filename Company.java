package com.sanjaeJava.company;
import java.util.List;

public class Company {
    private String companyName;
    private String Address;
    private final List<Departments> departmentsList;
    private final List<Office> offices;

    public Company(String comName, String addr, List<Departments> dept, List<Office> offices){//
        this.companyName = comName;
        this.Address = addr;
        this.departmentsList = dept;
        this.offices = offices;
    }

        public String getCompanyName(){
        return this.companyName;
        }

    public String getAddress(){
        return Address;
    }

    public List<Departments> getDepartmentsList(){
        return departmentsList;
    }
    public List<Office> getOfficeList(){
        return offices;
    }
}
