package com.sanjaeJava.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Department List
        Departments dept1 = new Departments("Accounting");
        Departments dept2 = new Departments("IT");
        Departments dept3 = new Departments("Sales");
        Departments dept4 = new Departments("Payroll");
    //Office List
         Office office1 = new Office("Main Office, First Floor Lobby", dept1);
         Office office2 = new Office("Sales Office, Second Floor", dept2);
         Office office3 = new Office("HR Office, Second Floor", dept4);

        //Employee List
        Employee[] newEmployee = {
                new Employee("Jane", dept1),
                new Employee("Bernie", dept1),
                new Employee("Barry", dept1),
                new Employee("Julia", dept1),
                new Employee("Marcia", dept1),
                new Employee("Gena", dept1),
                new Employee("Damani", dept1),
                new Employee("Markus", dept3),
                new Employee("Phillip", dept3),
                new Employee("Jason", dept3),
                new Employee("Denay", dept3),
                new Employee("Kryatol", dept3),
                new Employee("Vin", dept3),
                new Employee("Tracy", dept3),
                new Employee("Britania", dept3),
                new Employee("Lola", dept2),
                new Employee("Vera", dept2),
                new Employee("Debbian", dept2),
                new Employee("Brandon", dept2),
                new Employee("Trevor", dept2),
                new Employee("Jenny", dept2),
                new Employee("Brian", dept4),
                new Employee("Viola", dept4),
                new Employee("Steve", dept4),
                new Employee("Karen", dept4),
                new Employee("Bryan", dept4)
        };



        List<Departments> deptList = new ArrayList<Departments>();
        deptList.add(dept1);
        deptList.add(dept2);
        deptList.add(dept3);
        deptList.add(dept4);

        List<Office> newOffice = new ArrayList<Office>();
        newOffice.add(office1);
        newOffice.add(office2);
        newOffice.add(office3);


//        Office[] newOffice = {
//            new Office("Main Office, First Floor Lobby"),
//            new Office("Sales Office, Second Floor, First door on the right"),
//            new Office("HR Office, Second Floor, Last door on the left")
//        };


        //Created a company and added departments
        Company enterprise1 = new Company("MicroTech", "11 Mayfair Avenue", deptList, newOffice);
        //Office office1 = new Office("11 Mayfair Avenue", newOffice);

        //Printing departments
        System.out.println("\n=======================================================\n");
        System.out.println("Departnents : ");
        int count = 1;
        for(Departments dep: enterprise1.getDepartmentsList()){
            System.out.print(count++ + ". " + dep.getDptName()+ "\n");
        }
        System.out.println("\n=======================================================");
        count = 1;
        System.out.println("Offices : ");
        for(Office o: enterprise1.getOfficeList()){
           System.out.println(count++ + ". " + o.getOfficeAddress());
        }
        System.out.println("\n=======================================================");
        //Printing the list of employees
        List<Employee> employeeList = Arrays.asList(newEmployee);
        System.out.println("Employee List : \n");
        employeeList.stream().iterator().forEachRemaining(System.out::println);
        //for(Employee E: )

        //Printing the list of offices
//        List<Office> officeList = Arrays.asList(newOffice);
//        System.out.println("Employee List : ");
//        officeList.stream().forEach(System.out::println);
        //System.out.println(deptList.size());
    }
}
