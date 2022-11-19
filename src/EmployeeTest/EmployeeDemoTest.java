package EmployeeTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import EmployeeImpl.EmployeeDemo;
import Entity.Address;
import Entity.Employee;

public class EmployeeDemoTest {
    // List to store Employees
    private static List<Employee> emplist;

    // method to initialize Employee data
    public static void SetEmployeeData() {
        //Crerating objects of Address and putting Hard Coded Values
        Address addr1 = new Address(1, "Park Street", "Kolkata", "West Bengal", 100000);
        Address addr2 = new Address(2, "Amherst Street", "Kolkata", "West Bengal", 268000);
        Address addr3 = new Address(3, "RajPath", "Delhi", "India", 983200);

        //Creating Employee List with address objects
        emplist = new LinkedList<Employee>(Arrays.asList(new Employee("Ankan", 11, addr1, 159000),
                new Employee("Mini Mathur", 2, addr2, 100000), new Employee("Rahul Gandhi", 3, addr3, 953200)));

        // Showing the data after insert
        System.out.println("Showing Employee Data after Insert");
        for(Employee temp:emplist){
            System.out.println(temp);
        }
    }

    // Main Function to execute the program
    public static void main(String[] args){
        SetEmployeeData();
        EmployeeDemo employeeDemo = new EmployeeDemo();
        //Create collection of employee objects and get it sorted w.r.t. empsalary attribute.
        employeeDemo.sortBySalary(emplist);
        //Sort the collection created w.r.t. empname and empid attributes.
        employeeDemo.sortByNameId(emplist);
    }


}
