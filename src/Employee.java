// CSE 314: Advanced Programming
// Final Project
// Names & ID: 
//              Menna Alaa Eldin Abdelgayed Rasslan - 120210311
//              Sally Reda Eldosouky Zeineldeen - 120210008

public class Employee extends User {
    private int salary;
    private String department;
    private String emp_type;

    public Employee(String id, String name, String address, String email, String phone, int salary, String department, String emp_type) {
        super(id,name, address, email, phone);
        this.salary = salary;
        this.department = department;
        this.emp_type = emp_type;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Salary: "+getSalary());
        System.out.println("Department: "+getDepartment());
        System.out.println("Employee Type: "+getEmp_type());
    }
}









