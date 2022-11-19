package EmployeeImpl;

import java.util.Collections;
import java.util.List;

import Entity.Employee;

public class EmployeeDemo {

    //Create collection of employee objects and get it sorted w.r.t. empsalary attribute.
    public void sortBySalary(List<Employee> emplist) {
        Collections.sort(emplist, (emp1, emp2) -> (int) (emp1.getEmpsalary() - emp2.getEmpsalary()));

        System.out.println("Showing Employee List after sorting based on employee salary: ");
        for(Employee temp:emplist){
            System.out.println(temp);
        }
    }
    //Sort the collection created w.r.t. empname and empid attributes.
    public void sortByNameId(List<Employee> emplist) {
        // if Employees have same name then sort by Employee ID
        Collections.sort(emplist, (emp1, emp2) ->{
            if(emp1.getEmpname().compareTo(emp2.getEmpname()) == 0) {
                return emp1.getEmpid()-emp2.getEmpid();
            }
            else {
                return emp1.getEmpname().compareTo(emp2.getEmpname());
            }
        });

        System.out.println("Showing Employee List after sorting based on empname and empid: ");
        for(Employee temp:emplist){
            System.out.println(temp);
        }
    }

}
