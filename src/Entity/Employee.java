package Entity;

public class Employee {
    private String empname;
    private int empid;
    private Address empaddress;
    private double empsalary;

    public Employee() {

        super();
    }
    public Employee(String empname, int empid, Address empaddress, double empsalary) {
        super();
        this.empname = empname;
        this.empid = empid;
        this.empaddress = empaddress;
        this.empsalary = empsalary;
    }

    public String getEmpname() {

        return empname;
    }
    public void setEmpname(String empname) {

        this.empname = empname;
    }
    public int getEmpid() {

        return empid;
    }
    public void setEmpid(int empid) {

        this.empid = empid;
    }
    public Address getEmpaddress() {

        return empaddress;
    }
    public void setEmpaddress(Address empaddress) {

        this.empaddress = empaddress;
    }
    public double getEmpsalary() {

        return empsalary;
    }
    public void setEmpsalary(double empsalary) {

        this.empsalary = empsalary;
    }

    @Override
    public String toString() {
        return "Employee [empname=" + empname + ", empid=" + empid + ",\n empaddress=" + empaddress + ", empsalary="
                + empsalary + "]";
    }
}
